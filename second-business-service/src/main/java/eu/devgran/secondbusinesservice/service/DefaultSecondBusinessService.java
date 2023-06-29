package eu.devgran.secondbusinesservice.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DefaultSecondBusinessService implements SecondBusinessService {

    private final FirstBusinessServiceClient firstBusinessServiceClient;

    @Override
    @CircuitBreaker(name = "first-business-service-caller", fallbackMethod = "callFirstFallback")
    public String callFirst() {
        log.info("Sending call!");
        return firstBusinessServiceClient.callFirst();
    }

    public String callFirstFallback(Exception e) {
        return "Circuit breaker triggered. Retry in a while...";
    }
}

package eu.devgran.secondbusinesservice.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultSecondBusinessService implements SecondBusinessService {

    private final FirstBusinessServiceClient firstBusinessServiceClient;

    @Override
    @CircuitBreaker(name = "first-business-service-caller", fallbackMethod = "callFirstFallback")
    public String callFirst() {
        return firstBusinessServiceClient.callFirst();
    }

    public String callFirstFallback(Exception e) {
        return "Circuit breaker triggered. Retry in a while...";
    }
}

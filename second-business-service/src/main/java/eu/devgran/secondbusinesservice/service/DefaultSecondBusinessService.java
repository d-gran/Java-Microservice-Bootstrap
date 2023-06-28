package eu.devgran.secondbusinesservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultSecondBusinessService implements SecondBusinessService {

    private final FirstBusinessServiceClient firstBusinessServiceClient;

    @Override
    public String callFirst() {
        return firstBusinessServiceClient.callFirst();
    }
}

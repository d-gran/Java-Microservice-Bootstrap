package eu.devgran.secondbusinesservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("FIRST-BUSINESS-SERVICE")
public interface FirstBusinessServiceClient {

    @GetMapping("/first/call")
    String callFirst();
}

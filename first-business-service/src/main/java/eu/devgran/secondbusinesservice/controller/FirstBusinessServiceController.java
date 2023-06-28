package eu.devgran.secondbusinesservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
public class FirstBusinessServiceController {

    @GetMapping("/call")
    public String call() {
        return "First responded: " + UUID.randomUUID();
    }
}

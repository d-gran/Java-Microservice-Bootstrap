package eu.devgran.secondbusinesservice.controller;

import eu.devgran.secondbusinesservice.service.SecondBusinessService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SecondBusinessServiceController {

    private final SecondBusinessService secondBusinessService;

    @GetMapping("/call")
    public String call() {
        return "Second called first: " + secondBusinessService.callFirst();
    }
}

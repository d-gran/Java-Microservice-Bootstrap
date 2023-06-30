package eu.devgran.secondbusinesservice.controller;

import eu.devgran.secondbusinesservice.service.SecondBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SecondBusinessServiceController {

    private final SecondBusinessService secondBusinessService;

    @GetMapping("/call")
    public String call() {
        return "Second called first: " + secondBusinessService.callFirst();
    }
}

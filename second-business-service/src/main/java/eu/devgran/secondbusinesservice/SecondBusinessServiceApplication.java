package eu.devgran.secondbusinesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SecondBusinessServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondBusinessServiceApplication.class, args);
    }
}

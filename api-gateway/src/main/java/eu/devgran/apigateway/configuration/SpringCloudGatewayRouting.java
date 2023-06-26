package eu.devgran.apigateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudGatewayRouting {

    @Bean
    public RouteLocator configureRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("firstBusinessService", r->r.path("/first/**").uri("lb://FIRST-BUSINESS-SERVICE"))
                .route("secondBusinessService", r->r.path("/second/**").uri("lb://SECOND-BUSINESS-SERVICE"))
                .build();
    }
}

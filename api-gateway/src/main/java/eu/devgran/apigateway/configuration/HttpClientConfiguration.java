package eu.devgran.apigateway.configuration;

import io.netty.resolver.DefaultAddressResolverGroup;
import org.springframework.context.annotation.Bean;
import reactor.netty.http.client.HttpClient;

public class HttpClientConfiguration {

    // Workaround for Gateway's issues of it being unable to resolve registered services in Service Discovery
    @Bean
    public HttpClient httpClient() {
        return HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
    }
}

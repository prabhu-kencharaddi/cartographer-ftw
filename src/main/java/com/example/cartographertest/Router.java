package com.example.cartographertest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class Router {

    @Bean
    public RouterFunction<ServerResponse> getResponses() {
        return RouterFunctions.route(GET("/hello"), this::getMessage);
    }

    private Mono<ServerResponse> getMessage(ServerRequest serverRequest) {
        return ServerResponse.ok().bodyValue("Hello World");
    }
}

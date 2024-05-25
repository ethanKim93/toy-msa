package com.example.apigatewayservice.config;

import org.springframework.core.env.Environment;

//@Configuration
public class FilterConfig {
    Environment env;

    public FilterConfig(Environment env) {
        this.env = env;
    }

    //application.yml에 등록한 gateway 설정을, Java Code에서 처리 할 수 있음
//    @Bean
//    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder, AuthorizationHeaderFilter myfilter) {
//
//        return builder.routes()
//                .route(r -> r.path("/first-service/**")
//                            .filters(f -> f.addRequestHeader("first-request", "first-request-header-by-java")
//                                           .addResponseHeader("first-response", "first-response-header-by-java")
////                                           .filter(myfilter.apply(new AuthorizationHeaderFilter.Config()))
//                            )
//                            .uri("http://localhost:8081"))
//                .route(r -> r.path("/second-service/**")
//                        .filters(f -> f.addRequestHeader("second-request", "second-request-header-by-java")
//                                .addResponseHeader("second-response", "second-response-header-by-java"))
//                        .uri("http://localhost:8082"))
//                .build();
//    }

}

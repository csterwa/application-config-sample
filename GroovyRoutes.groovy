import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import java.util.function.Function;

class GroovyRoutes {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("resource", (Function) { r -> r.path("/google") })
            .uri("http://www.google.com")
            .build();
    }

}

package revature.pro0.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import revature.pro0.models.Berry;


@Configuration
public class BerryConfig {

    @Bean
    public Berry berry(){
        return new Berry("Strawberry", "Sweet and sour taste");
    }
}
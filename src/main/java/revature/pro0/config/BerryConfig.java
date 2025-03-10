package revature.pro0.config;

import revature.pro0.models.Berry;

@Configuration
public class BerryConfig {

    @Bean
    public Berry berry(){
        return new Berry("Strawberry", "Sweet and sour taste");
    }
}
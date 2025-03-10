package revature.pro0.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import revature.pro0.models.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalConfig {

    @Bean
    @Scope("prototype")
    public Animal getRandomAnimal(){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fluffy", "cat", "furry", 5));
        animals.add(new Animal("Rex", "lizard", "scaly", 10));
        animals.add(new Animal("Bow-wow", "dog", "hairy", 3));

        return animals.get(new Random().nextInt(animals.size()));
    }
}

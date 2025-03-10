package revature.pro0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import revature.pro0.config.BerryConfig;
import revature.pro0.models.Berry;

public class Main {
    public static void main(String[] args) {

        ApplicationContext javaConfigContextBerry = new AnnotationConfigApplicationContext(BerryConfig.class);
        Berry berry1 = javaConfigContextBerry.getBean(Berry.class);
        System.out.println(berry1);
    }
}
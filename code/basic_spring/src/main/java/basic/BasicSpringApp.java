package basic;

import domain.construction.impl.LittleHouse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicSpringApp {

    public static void main( String[] args ) {

        /*
        *
        *   Our little app builds a house and prints out the results.
        *
        */

        System.out.println( "Loading Spring Config!");

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        for( String name : context.getBeanDefinitionNames() ) {
            System.out.println("Bean: " + name );
        }

        LittleHouse house = (LittleHouse) context.getBean( "house" );
        System.out.println("The house was built like so: " + house );

    }

}
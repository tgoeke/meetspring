package basic;

import domain.construction.impl.LittleHouse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationQualifiersSpringApp {

    public static void main( String[] args ) {

        /*
        *
        *   Our little app builds a house and prints out the results.
        *
        */

        System.out.println( "Loading Spring Config!");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("domain.construction");
        context.refresh();

        for( String name : context.getBeanDefinitionNames() ) {
            System.out.println("Bean: " + name );
        }

        LittleHouse house = (LittleHouse) context.getBean( "house" );
        System.out.println("The house was built like so: " + house );

    }

}
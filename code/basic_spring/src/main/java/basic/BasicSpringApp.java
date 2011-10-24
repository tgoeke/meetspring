package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicSpringApp {

    public static void main( String[] args ) {
        System.out.println( "Loading Spring Config!");

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

    }

}
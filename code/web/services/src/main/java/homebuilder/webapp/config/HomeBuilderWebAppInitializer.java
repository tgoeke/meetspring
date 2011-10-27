package homebuilder.webapp.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class HomeBuilderWebAppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.scan( "homebuilder.webapp" );

        servletContext.addListener( new ContextLoaderListener( rootContext ) );

        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
        dispatcherContext.register( DispatcherConfig.class );
        dispatcherContext.refresh();

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet( "dispatcher", new DispatcherServlet( new GenericWebApplicationContext( ) ) );
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping( "/" );

    }

}

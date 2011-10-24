package domain.construction.impl;

import domain.construction.spi.HandleFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class HandleFactoryImpl implements HandleFactory, InitializingBean {

    @Autowired
    @Qualifier("trimLevel")
    public String trimLevel;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("The Handle Factory is making: " + trimLevel + " handles.");
    }
}

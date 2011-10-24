package domain.construction.impl;

import domain.construction.spi.Door;
import domain.construction.spi.Knob;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("door")
public class RedDoor implements Door, InitializingBean {

    private String description = "Red Door";

    @Autowired
    private Knob knob;

    @Override
    public String toString() {
        return "RedDoor{" +
                "description='" + description + '\'' +
                ", knob=" + knob +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Red Door says, \"I've been installed.\"");
    }
}

package domain.construction.impl;

import domain.construction.spi.Knob;
import org.springframework.stereotype.Component;

@Component("budget")
public class WoodenHandle implements Knob {

    private String description = "Wooden Handle";

    @Override
    public String toString() {
        return "WoodenHandle{" +
                "description='" + description + '\'' +
                '}';
    }

}

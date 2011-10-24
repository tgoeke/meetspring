package domain.construction.impl;

import domain.construction.spi.Knob;
import org.springframework.stereotype.Component;

@Component("premium")
public class SilverHandle implements Knob {

    private String description = "Silver Handle";

    @Override
    public String toString() {
        return "SilverHandle{" +
                "description='" + description + '\'' +
                '}';
    }

}

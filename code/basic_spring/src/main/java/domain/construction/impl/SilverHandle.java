package domain.construction.impl;

import domain.construction.spi.Knob;

public class SilverHandle implements Knob {

    private String description = "Silver Handle";

    @Override
    public String toString() {
        return "SilverHandle{" +
                "description='" + description + '\'' +
                '}';
    }

}

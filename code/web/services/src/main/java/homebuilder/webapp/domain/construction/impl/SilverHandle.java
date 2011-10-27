package homebuilder.webapp.domain.construction.impl;

import homebuilder.webapp.domain.construction.spi.Knob;

public class SilverHandle implements Knob {

    private String description = "Silver Handle";

    @Override
    public String toString() {
        return "SilverHandle{" +
                "description='" + description + '\'' +
                '}';
    }

}

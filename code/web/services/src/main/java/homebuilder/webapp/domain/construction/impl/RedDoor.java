package homebuilder.webapp.domain.construction.impl;

import homebuilder.webapp.domain.construction.spi.Door;
import homebuilder.webapp.domain.construction.spi.Knob;

public class RedDoor implements Door {

    private String description = "Red Door";

    private Knob knob;

    public RedDoor(Knob knob) {
        this.knob = knob;
    }

    public RedDoor() {
    }

    @Override
    public String toString() {
        return "RedDoor{" +
                "description='" + description + '\'' +
                ", knob=" + knob +
                '}';
    }

}

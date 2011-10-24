package domain.contruction.impl;

import domain.contruction.spi.Door;
import domain.contruction.spi.Knob;

public class RedDoor implements Door {

    private String description = "Red Door";

    private Knob knob;

    public RedDoor(Knob knob) {
        this.knob = knob;
    }

    @Override
    public String toString() {
        return "RedDoor{" +
                "description='" + description + '\'' +
                ", knob=" + knob +
                '}';
    }

}

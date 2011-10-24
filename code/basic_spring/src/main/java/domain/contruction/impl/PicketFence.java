package domain.contruction.impl;

import domain.contruction.spi.Fence;

public class PicketFence implements Fence {

    private String description = "Picket PicketFence";

    @Override
    public String toString() {
        return "PicketFence{" +
                "description='" + description + '\'' +
                '}';
    }

}

package domain.construction.impl;

import domain.construction.spi.Fence;

public class PicketFence implements Fence {

    private String description = "Picket PicketFence";

    @Override
    public String toString() {
        return "PicketFence{" +
                "description='" + description + '\'' +
                '}';
    }

}

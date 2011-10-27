package homebuilder.webapp.domain.construction.impl;

import homebuilder.webapp.domain.construction.spi.Fence;

public class PicketFence implements Fence {

    private String description = "Picket PicketFence";

    @Override
    public String toString() {
        return "PicketFence{" +
                "description='" + description + '\'' +
                '}';
    }

}

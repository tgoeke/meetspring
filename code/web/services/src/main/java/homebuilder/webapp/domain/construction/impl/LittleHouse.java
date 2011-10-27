package homebuilder.webapp.domain.construction.impl;

import homebuilder.webapp.domain.construction.spi.Door;
import homebuilder.webapp.domain.construction.spi.Fence;
import homebuilder.webapp.domain.construction.spi.House;

public class LittleHouse implements House {

    private String description = "Little House on the Prairie";

    private Door door;
    private Fence fence;

    public LittleHouse(Door door, Fence fence) {
        this.door = door;
        this.fence = fence;
    }

    @Override
    public String toString() {
        return "LittleHouse{" +
                "description='" + description + '\'' +
                ", door=" + door +
                ", fence=" + fence +
                '}';
    }

}

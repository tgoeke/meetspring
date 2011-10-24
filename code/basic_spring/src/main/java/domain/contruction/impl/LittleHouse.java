package domain.contruction.impl;

import domain.contruction.spi.Door;
import domain.contruction.spi.Fence;
import domain.contruction.spi.House;

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

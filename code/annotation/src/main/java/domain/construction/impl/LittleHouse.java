package domain.construction.impl;

import domain.construction.spi.Door;
import domain.construction.spi.Fence;
import domain.construction.spi.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("house")
public class LittleHouse implements House {

    private String description = "Little House on the Prairie";

    @Autowired
    private Door door;

    @Autowired
    private Fence fence;

    @Override
    public String toString() {
        return "LittleHouse{" +
                "description='" + description + '\'' +
                ", door=" + door +
                ", fence=" + fence +
                '}';
    }

}

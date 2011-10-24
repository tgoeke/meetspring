package domain.construction.config;

import domain.construction.impl.LittleHouse;
import domain.construction.impl.PicketFence;
import domain.construction.impl.RedDoor;
import domain.construction.impl.SilverHandle;
import domain.construction.spi.Door;
import domain.construction.spi.Fence;
import domain.construction.spi.House;
import domain.construction.spi.Knob;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application {

    @Value("#{ systemProperties['trimLevel'] }")
    private String trimLevel;

    public @Bean String trimLevel() {
        return trimLevel;
    }

//    public @Bean Knob knob() {
//        return new SilverHandle();
//    }
//
//    public @Bean Door door() {
//        return new RedDoor( knob() );
//    }
//
//    public @Bean Fence fence() {
//        return new PicketFence();
//    }
//
//    public @Bean House house() {
//        return new LittleHouse( door(), fence() );
//    }

}

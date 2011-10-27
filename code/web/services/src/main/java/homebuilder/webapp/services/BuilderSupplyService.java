package homebuilder.webapp.services;

import homebuilder.webapp.domain.construction.spi.Door;

import java.util.List;

public interface BuilderSupplyService {
    List<Door> getDoors();
}

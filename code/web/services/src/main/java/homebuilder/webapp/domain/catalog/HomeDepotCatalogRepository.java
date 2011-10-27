package homebuilder.webapp.domain.catalog;

import homebuilder.webapp.domain.construction.impl.RedDoor;
import homebuilder.webapp.domain.construction.spi.Door;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HomeDepotCatalogRepository implements CatalogRepository {

    @Override
    public List<Door> getDoors() {

        List<Door> doors = new ArrayList<Door>();
        doors.add( new RedDoor() );

        return doors;
    }
}

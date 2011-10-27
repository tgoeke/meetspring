package homebuilder.webapp.domain.catalog;

import homebuilder.webapp.domain.construction.spi.Door;

import java.util.List;

public interface CatalogRepository {
    List<Door> getDoors();
}

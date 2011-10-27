package homebuilder.webapp.services;

import homebuilder.webapp.domain.catalog.CatalogRepository;
import homebuilder.webapp.domain.construction.spi.Door;
import homebuilder.webapp.domain.houses.HousingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeDepotService implements BuilderSupplyService {

    @Autowired
    private CatalogRepository catalogRepository;

    @Autowired
    private HousingRepository housingRepository;

    @Override
    public List<Door> getDoors() {
        return catalogRepository.getDoors();
    }
}

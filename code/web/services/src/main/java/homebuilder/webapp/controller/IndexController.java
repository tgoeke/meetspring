package homebuilder.webapp.controller;

import homebuilder.webapp.domain.construction.spi.Door;
import homebuilder.webapp.services.BuilderSupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private BuilderSupplyService builderSupply;

    @RequestMapping( value = "/", method = RequestMethod.GET )
    public String getIndex( Model model ) {

        List<Door> doors = builderSupply.getDoors();

        return "index";
    }

}

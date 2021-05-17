package triss.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Beatrice V.
 * @created 17.05.2021 - 11:37
 * @project pet-clinic
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}

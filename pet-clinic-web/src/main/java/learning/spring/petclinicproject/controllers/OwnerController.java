package learning.spring.petclinicproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("owners")// class level mapping
@Controller
public class OwnerController {
    @RequestMapping({"","/","index","index.html"})
    public String listOwners(){
        return "owners/index";
    }
}

package ro.gligor.bar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.gligor.bar.Cocktail;

@Controller
public class IndexController {

    @RequestMapping({"", "/"})
    public String index(Model model){
        Cocktail randomCocktail = new Cocktail(1, "url", "ingrediente", "prep", "about");
        model.addAttribute("randomCocktail", randomCocktail);

        return "index";
    }

}

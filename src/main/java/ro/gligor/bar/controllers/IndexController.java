package ro.gligor.bar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.gligor.bar.Drink;
import ro.gligor.bar.Root;

import java.io.IOException;

import static ro.gligor.bar.Tools.randomCocktail;

@Controller
public class IndexController {

    @RequestMapping({"", "/"})
    public String index(Model model) {
        Root root = null;
        root = randomCocktail();

        model.addAttribute("randomCocktail", root);

        return "index";
    }

}

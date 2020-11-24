package ro.gligor.bar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.gligor.bar.Cocktail;
import ro.gligor.bar.Tools;

@Controller
public class IndexController {

    @RequestMapping({"", "/"})
    public String index(Model model) {
        Tools t = new Tools();

        Cocktail randomCocktail = t.randomCocktail();

        model.addAttribute("name", randomCocktail.getName());
        model.addAttribute("glass", randomCocktail.getGlass());
        model.addAttribute("instructions", randomCocktail.getInstructions());
        model.addAttribute("picture", randomCocktail.getPicture());
        model.addAttribute("ingredient1", randomCocktail.getIngredient1());
        model.addAttribute("ingredient2", randomCocktail.getIngredient2());
        model.addAttribute("ingredient3", randomCocktail.getIngredient3());
        model.addAttribute("ingredient4", randomCocktail.getIngredient4());
        model.addAttribute("ingredient5", randomCocktail.getIngredient5());
        model.addAttribute("ingredient6", randomCocktail.getIngredient6());
        model.addAttribute("ingredient7", randomCocktail.getIngredient7());
        model.addAttribute("ingredient8", randomCocktail.getIngredient8());
        model.addAttribute("ingredient9", randomCocktail.getIngredient9());
        model.addAttribute("ingredient10", randomCocktail.getIngredient10());
        model.addAttribute("ingredient11", randomCocktail.getIngredient11());
        model.addAttribute("ingredient12", randomCocktail.getIngredient12());
        model.addAttribute("ingredient13", randomCocktail.getIngredient13());
        model.addAttribute("ingredient14", randomCocktail.getIngredient14());
        model.addAttribute("ingredient15", randomCocktail.getIngredient15());

        return "index.html";
    }

    @RequestMapping
    public String makeCocktail(Model model){
        return "makecocktail.html";
    }

}

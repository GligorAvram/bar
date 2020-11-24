package ro.gligor.bar;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;


public class Tools {
    public Cocktail randomCocktail(){
        Root r = parseJsonDrink("https://www.thecocktaildb.com/api/json/v1/1/random.php");


        Cocktail randomCocktail = new Cocktail(r.getDrinks().get(0).getStrDrink(),
                                                r.getDrinks().get(0).getStrGlass(),
                                                r.getDrinks().get(0).getStrInstructions(),
                                                r.getDrinks().get(0).getStrDrinkThumb(),
                                                r.getDrinks().get(0).getStrIngredient1(),
                                                r.getDrinks().get(0).getStrIngredient2(),
                                                r.getDrinks().get(0).getStrIngredient3(),
                                                r.getDrinks().get(0).getStrIngredient4(),
                                                r.getDrinks().get(0).getStrIngredient5(),
                                                r.getDrinks().get(0).getStrIngredient6(),
                                                r.getDrinks().get(0).getStrIngredient7(),
                                                r.getDrinks().get(0).getStrIngredient8(),
                                                r.getDrinks().get(0).getStrIngredient9(),
                                                r.getDrinks().get(0).getStrIngredient10(),
                                                r.getDrinks().get(0).getStrIngredient11(),
                                                r.getDrinks().get(0).getStrIngredient12(),
                                                r.getDrinks().get(0).getStrIngredient13(),
                                                r.getDrinks().get(0).getStrIngredient14(),
                                                r.getDrinks().get(0).getStrIngredient15(),
                                                r.getDrinks().get(0).getStrMeasure1(),
                                                r.getDrinks().get(0).getStrMeasure2(),
                                                r.getDrinks().get(0).getStrMeasure3(),
                                                r.getDrinks().get(0).getStrMeasure4(),
                                                r.getDrinks().get(0).getStrMeasure5(),
                                                r.getDrinks().get(0).getStrMeasure6(),
                                                r.getDrinks().get(0).getStrMeasure7(),
                                                r.getDrinks().get(0).getStrMeasure8(),
                                                r.getDrinks().get(0).getStrMeasure9(),
                                                r.getDrinks().get(0).getStrMeasure10(),
                                                r.getDrinks().get(0).getStrMeasure11(),
                                                r.getDrinks().get(0).getStrMeasure12(),
                                                r.getDrinks().get(0).getStrMeasure13(),
                                                r.getDrinks().get(0).getStrMeasure14(),
                                                r.getDrinks().get(0).getStrMeasure15());

        return randomCocktail;
    }

    public Cocktail findCocktailByIngredient(){
        Root r = parseJsonDrink("https://www.thecocktaildb.com/api/json/v1/1/filter.php?i=Gin");


    }


    public Root parseJsonDrink(String url) {
        try {
            ObjectMapper om = new ObjectMapper();
            Root root = om.readValue(new URL(url), Root.class);
            return root;
        } catch (Exception e) {
            e.printStackTrace();
        }
    return null;
    }
}

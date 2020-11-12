package ro.gligor.bar;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.net.URL;


public class Tools {
//    public static Drink randomCocktail() throws IOException {
//        URL url = new URL("https://www.thecocktaildb.com/api/json/v1/1/random.php");
//        ObjectMapper mapper = new ObjectMapper();
//        Drink cocktail = mapper.readValue(url, Drink.class);
//
//        return cocktail;
//    }

    public static Root randomCocktail() {
        try {
            ObjectMapper om = new ObjectMapper();
            Root root = om.readValue(new URL("https://www.thecocktaildb.com/api/json/v1/1/random.php"), Root.class);
            return root;
        } catch (Exception e) {
            e.printStackTrace();
        }
    return null;
    }
}

package ro.gligor.bar;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
public class Root{
    @JsonProperty("drinks")
    public List<Drink> getDrinks() {
        return this.drinks; }
    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks; }
    List<Drink> drinks;
}
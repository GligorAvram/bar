package ro.gligor.bar;

public class Cocktail {
    private int id;
    private String url;
    private String ingredients;
    private String preparation;
    private String history;//maybe...

    public Cocktail(int id, String url, String ingredients, String preparation, String history) {
        this.id = id;
        this.url = url;
        this.ingredients = ingredients;
        this.preparation = preparation;
        this.history = history;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}

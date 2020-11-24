package ro.gligor.bar;

public class Cocktail {

    private String name;
    private String glass;
    private String instructions;
    private String picture;
    private String ingredient1;
    private String ingredient2;
    private String ingredient3;
    private String ingredient4;
    private String ingredient5;
    private String ingredient6;
    private String ingredient7;
    private String ingredient8;
    private String ingredient9;
    private String ingredient10;
    private String ingredient11;
    private String ingredient12;
    private String ingredient13;
    private String ingredient14;
    private String ingredient15;

    public Cocktail(String name, String glass, String instructions, String picture, String ingredient1,
                    String ingredient2, String ingredient3, String ingredient4, Object ingredient5,
                    Object ingredient6, Object ingredient7, Object ingredient8, Object ingredient9,
                    Object ingredient10, Object ingredient11, Object ingredient12, Object ingredient13,
                    Object ingredient14, Object ingredient15, String measure1, String measure2,
                    String measure3, String measure4, Object measure5, Object measure6, Object measure7,
                    Object measure8, Object measure9, Object measure10, Object measure11, Object measure12,
                    Object measure13, Object measure14, Object measure15) {
        this.name = name;
        this.glass = glass;
        this.instructions = instructions;
        this.picture = picture;

        if(ingredient1 != null){
            if(measure1 != null){
                this.ingredient1 = ingredient1 + ": " + measure1;
            }
            else{
                this.ingredient1 = ingredient1.toString();
            }
        }
        else{
            this.ingredient1 = "";
        }

        if(ingredient2 != null){
            if(measure2 != null){
                this.ingredient2 = ingredient2.toString() + ": " + measure2.toString();
            }
            else{
                this.ingredient2 = ingredient2.toString();
            }
        }
        else{
            this.ingredient2 = "";
        }

        if(ingredient3 != null){
            if(measure3 != null){
                this.ingredient3 = ingredient3.toString() + ": " + measure3.toString();
            }
            else{
                this.ingredient3 = ingredient3.toString();
            }
        }
        else{
            this.ingredient3 = "";
        }

        if(ingredient4 != null){
            if(measure4 != null){
                this.ingredient4 = ingredient4.toString() + ": " + measure4.toString();
            }
            else{
                this.ingredient4 = ingredient4.toString();
            }
        }
        else{
            this.ingredient4 = "";
        }

        if(ingredient5 != null){
            if(measure5 != null){
                this.ingredient5 = ingredient5.toString() + ": " + measure5.toString();
            }
            else{
                this.ingredient5 = ingredient5.toString();
            }
        }
        else{
            this.ingredient5 = "";
        }

        if(ingredient6 != null){
            if(measure6 != null){
                this.ingredient6 = ingredient6.toString() + ": " + measure6.toString();
            }
            else{
                this.ingredient6 = ingredient6.toString();
            }
        }
        else{
            this.ingredient6 = "";
        }

        if(ingredient7 != null){
            if(measure7 != null){
                this.ingredient7 = ingredient7.toString() + ": " + measure7.toString();
            }
            else{
                this.ingredient7 = ingredient7.toString();
            }
        }
        else{
            this.ingredient7 = "";
        }

        if(ingredient8 != null){
            if(measure8 != null){
                this.ingredient8 = ingredient8.toString() + ": " + measure8.toString();
            }
            else{
                this.ingredient8 = ingredient8.toString();
            }
        }
        else{
            this.ingredient8 = "";
        }

        if(ingredient9 != null){
            if(measure9 != null){
                this.ingredient9 = ingredient9.toString() + ": " + measure9.toString();
            }
            else{
                this.ingredient9 = ingredient9.toString();
            }
        }
        else{
            this.ingredient9 = "";
        }

        if(ingredient10 != null){
            if(measure10 != null){
                this.ingredient10 = ingredient10.toString() + ": " + measure10.toString();
            }
            else{
                this.ingredient10 = ingredient10.toString();
            }
        }
        else{
            this.ingredient10 = "";
        }

        if(ingredient11 != null){
            if(measure11 != null){
                this.ingredient11 = ingredient11.toString() + ": " + measure11.toString();
            }
            else{
                this.ingredient11 = ingredient11.toString();
            }
        }
        else{
            this.ingredient11 = "";
        }

        if(ingredient12 != null){
            if(measure12 != null){
                this.ingredient12 = ingredient12.toString() + ": " + measure12.toString();
            }
            else{
                this.ingredient12 = ingredient12.toString();
            }
        }
        else{
            this.ingredient12 = "";
        }

        if(ingredient13 != null){
            if(measure13 != null){
                this.ingredient13 = ingredient13.toString() + ": " + measure13.toString();
            }
            else{
                this.ingredient13 = ingredient13.toString();
            }
        }
        else{
            this.ingredient13 = "";
        }

        if(ingredient14 != null){
            if(measure14 != null){
                this.ingredient14 = ingredient14.toString() + ": " + measure14.toString();
            }
            else{
                this.ingredient14 = ingredient14.toString();
            }
        }
        else{
            this.ingredient14 = "";
        }

        if(ingredient15 != null){
            if(measure15 != null){
                this.ingredient15 = ingredient15.toString() + ": " + measure15.toString();
            }
            else{
                this.ingredient15 = ingredient15.toString();
            }
        }
        else{
            this.ingredient15 = "";
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getIngredient1() {
        return ingredient1;
    }

    public void setIngredient1(String ingredient1) {
        this.ingredient1 = ingredient1;
    }

    public String getIngredient2() {
        return ingredient2;
    }

    public void setIngredient2(String ingredient2) {
        this.ingredient2 = ingredient2;
    }

    public String getIngredient3() {
        return ingredient3;
    }

    public void setIngredient3(String ingredient3) {
        this.ingredient3 = ingredient3;
    }

    public String getIngredient4() {
        return ingredient4;
    }

    public void setIngredient4(String ingredient4) {
        this.ingredient4 = ingredient4;
    }

    public String getIngredient5() {
        return ingredient5;
    }

    public void setIngredient5(String ingredient5) {
        this.ingredient5 = ingredient5;
    }

    public String getIngredient6() {
        return ingredient6;
    }

    public void setIngredient6(String ingredient6) {
        this.ingredient6 = ingredient6;
    }

    public String getIngredient7() {
        return ingredient7;
    }

    public void setIngredient7(String ingredient7) {
        this.ingredient7 = ingredient7;
    }

    public String getIngredient8() {
        return ingredient8;
    }

    public void setIngredient8(String ingredient8) {
        this.ingredient8 = ingredient8;
    }

    public String getIngredient9() {
        return ingredient9;
    }

    public void setIngredient9(String ingredient9) {
        this.ingredient9 = ingredient9;
    }

    public String getIngredient10() {
        return ingredient10;
    }

    public void setIngredient10(String ingredient10) {
        this.ingredient10 = ingredient10;
    }

    public String getIngredient11() {
        return ingredient11;
    }

    public void setIngredient11(String ingredient11) {
        this.ingredient11 = ingredient11;
    }

    public String getIngredient12() {
        return ingredient12;
    }

    public void setIngredient12(String ingredient12) {
        this.ingredient12 = ingredient12;
    }

    public String getIngredient13() {
        return ingredient13;
    }

    public void setIngredient13(String ingredient13) {
        this.ingredient13 = ingredient13;
    }

    public String getIngredient14() {
        return ingredient14;
    }

    public void setIngredient14(String ingredient14) {
        this.ingredient14 = ingredient14;
    }

    public String getIngredient15() {
        return ingredient15;
    }

    public void setIngredient15(String ingredient15) {
        this.ingredient15 = ingredient15;
    }
}

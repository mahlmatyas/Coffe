package Coffee;

import java.util.ArrayList;
import java.util.List;

public class Capuccino extends CoffeeType{
    public List<String> getIngredients(){
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Coffee");
        ingredients.add("Milk");
        ingredients.add("Sugar");
        return ingredients;
    }
}

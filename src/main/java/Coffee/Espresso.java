package Coffee;

import java.util.ArrayList;
import java.util.List;

public class Espresso extends CoffeeType{
    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Coffee");
        ingredients.add("Sugar");
        return ingredients;
    }

}

import Coffee.CoffeeTypeFactory;
import Coffee.CoffeeType;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class ExampleTest {

    @Test
    public void testEspresso(){
        CoffeeTypeFactory factory = new CoffeeTypeFactory();
        CoffeeType coffeeType = factory.create(1);
        List<String> ingredients = coffeeType.getIngredients();
        assertEquals(2,ingredients.size());
        assertEquals("Coffee",ingredients.get(0));
        assertEquals("Sugar",ingredients.get(1));
    }

    @Test
    public void testCapuccino(){
        CoffeeTypeFactory factory = new CoffeeTypeFactory();
        CoffeeType coffeeType = factory.create(2);
        List<String> ingredients = coffeeType.getIngredients();
        assertEquals(3,ingredients.size());
        assertEquals("Coffee",ingredients.get(0));
        assertEquals("Milk",ingredients.get(1));
        assertEquals("Sugar",ingredients.get(2));
    }

    @Test
    public void testAmericano(){
        CoffeeTypeFactory factory = new CoffeeTypeFactory();
        CoffeeType coffeeType = factory.create(3);
        List<String> ingredients = coffeeType.getIngredients();
        assertEquals(3,ingredients.size());
        assertEquals("Coffee",ingredients.get(0));
        assertEquals("Water",ingredients.get(1));
        assertEquals("Sugar",ingredients.get(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalid(){
        CoffeeTypeFactory factory = new CoffeeTypeFactory();
        CoffeeType coffeeType = factory.create(3268);
    }
}

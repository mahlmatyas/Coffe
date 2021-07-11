package Coffee;

public class CoffeeTypeFactory {
    public CoffeeType create(int pressedButtonNumber){

        if(pressedButtonNumber > 3 || pressedButtonNumber < 1 ) {
            throw new IllegalArgumentException("Numbers must be between or equal 3 and 1");
        }


            switch (pressedButtonNumber) {
                case 1 : return new Espresso();
                case 2 : return new Capuccino();
                case 3 : return new Americano();
            }
            return null;
        }
        /*
        if (pressedButtonNumber == 1){
            return new Espresso();
        }else if (pressedButtonNumber == 2){
            return new Capuccino();
        }else if(pressedButtonNumber == 3){
            return new Americano();
        }else {
            throw new IllegalArgumentException("Out of ordering opportunity");
        }*/
}

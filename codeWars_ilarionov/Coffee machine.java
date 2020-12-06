package codewars.coffee;
import java.util.Map;
import java.util.HashMap;
import static codewars.coffee.PreloadedCoffee.*;

public class CoffeeKata{
     class MyCoffeeMachine implements CoffeeMachine{
        @Override
        public Coffee makeCoffee() {
            numberCoffee ++;
            Coffee coffee = CoffeeMachineFactory.buyCoffeeMachine().makeCoffee();
            map.merge(coffee.getType(),1,Integer::sum);
            return coffee;
        }
    }
    private final CoffeeMachine machine;
    private int numberCoffee = 0;
    private Map<String,Integer> map = new HashMap<>();
    private int coffeeCount = 0;
    public CoffeeKata() {
        machine = createMachine();
    }

    public int numberOfCoffeeMade() {
        return numberCoffee;
    }

    public CoffeeMachine getMachine() {
        return machine;
    }

    public Map<String, Integer> numberOfCoffeeTypesMade() {
        return map;
    }

    private CoffeeMachine createMachine() {

        return new MyCoffeeMachine ();
    }
}
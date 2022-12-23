package machine;

import boire.Coffee;
import boire.Boire;

public class CoffeeMachine implements Machines {
    @Override
    public Boire make(String name) {
        return new Coffee(name);
    }
}

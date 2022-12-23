import boire.Coffee;
import boire.Matcha;
import boire.Boire;
import boire.Tea;
import machine.Machines;
import machine.Factory;

public class faire {
    public Boire faire(String type, String productName) {
        Machines machines = Factory.factory(type);
        Boire boire = machines.make(productName);

        if (boire instanceof Tea) {
            boire.addIngredient("Sugar");
        }

        if (boire instanceof Coffee) {
            boire.addIngredient("Milk");
            boire.addIngredient("Sirop");
        }
        if(boire instanceof Matcha){
            boire.addIngredient("Milk");
        }
        return boire;
    }
}

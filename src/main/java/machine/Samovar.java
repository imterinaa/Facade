package machine;

import boire.Boire;
import boire.Tea;

public class Samovar implements Machines {
    @Override
    public Boire make(String name) {
        return new Tea(name);
    }
}

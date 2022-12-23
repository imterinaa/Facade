package machine;

import boire.Matcha;
import boire.Boire;

public class MatchaMachine implements Machines {
    @Override
    public Boire make(String name) {
        return new Matcha(name);
    }
}

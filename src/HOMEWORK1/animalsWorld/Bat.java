package HOMEWORK1.animalsWorld;

import java.util.HashSet;

import static HOMEWORK1.animalsWorld.CoverTypes.WOOL;
import static HOMEWORK1.animalsWorld.LimbsTypes.*;
import static HOMEWORK1.animalsWorld.MobilityTypes.*;
import static HOMEWORK1.animalsWorld.RespiratoryOrgans.LUNGS;

public class Bat extends Animal {
    public Bat () {
        super("Летучая мышь", WOOL, PAWS, 2, HANDS_WINGS, 2, true, LUNGS,
                new HashSet<MobilityTypes>(){{
                    add(FLYING);
                }});
    }

    public void swims() {
        System.out.println("Летучие мыши не плавают");
    }
    public void goes() {
        System.out.println("Летучие мыши не ходят");
    }
}

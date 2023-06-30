package HOMEWORK1.animalsWorld;

import java.util.HashSet;

import static HOMEWORK1.animalsWorld.CoverTypes.WOOL;
import static HOMEWORK1.animalsWorld.LimbsTypes.LEGS;
import static HOMEWORK1.animalsWorld.LimbsTypes.NONE;
import static HOMEWORK1.animalsWorld.MobilityTypes.*;
import static HOMEWORK1.animalsWorld.RespiratoryOrgans.LUNGS;

public class Giraffe extends Animal {
    public Giraffe () {
        super("Жираф", WOOL, LEGS, 4, NONE, 0, true, LUNGS,
                new HashSet<MobilityTypes>(){{
                    add(GOING);
                    add(RUNNING);
                }});
    }
    public void swims() {
        System.out.println("Жирафы не плавают");
    }

    public void flies() {
        System.out.println("Жирафы не летают");
    }
}

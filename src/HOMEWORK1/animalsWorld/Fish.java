package HOMEWORK1.animalsWorld;

import java.util.HashSet;

import static HOMEWORK1.animalsWorld.CoverTypes.SCALES;
import static HOMEWORK1.animalsWorld.CoverTypes.WOOL;
import static HOMEWORK1.animalsWorld.LimbsTypes.*;
import static HOMEWORK1.animalsWorld.MobilityTypes.*;
import static HOMEWORK1.animalsWorld.RespiratoryOrgans.GILLS;
import static HOMEWORK1.animalsWorld.RespiratoryOrgans.LUNGS;

public class Fish extends Animal {
    public Fish() {
        super("Рыба", SCALES, FINS, 8, NONE, 0, true, GILLS,
                new HashSet<MobilityTypes>(){{
                    add(SWIMMING);
                }});
    }
    public void flies() {
        System.out.println("Рыбы не летают");
    }
    public void goes() {
        System.out.println("Рыбы не ходят");
    }
}

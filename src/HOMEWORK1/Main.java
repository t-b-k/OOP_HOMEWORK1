package HOMEWORK1;
import HOMEWORK1.animalsWorld.*;

import java.util.HashSet;
import java.util.LinkedList;

import static HOMEWORK1.animalsWorld.AnimalsColours.RED;
import static HOMEWORK1.animalsWorld.CoverTypes.WOOL;
import static HOMEWORK1.animalsWorld.LimbsTypes.NONE;
import static HOMEWORK1.animalsWorld.LimbsTypes.PAWS;
import static HOMEWORK1.animalsWorld.MobilityTypes.*;
import static HOMEWORK1.animalsWorld.RespiratoryOrgans.LUNGS;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("СОБАКА", WOOL, PAWS, 4, NONE, 0, true, LUNGS,
                new HashSet<MobilityTypes>(){{
                    add(RUNNING);}
                });
        System.out.println(animal1);
        Animal animal2 = new Animal();
        System.out.println(animal2);
        LinkedList<Animal> animals = new LinkedList<>();
        animals.add(animal1);
        animals.add(animal2);
        System.out.println(animals);
        animal1.goes();
        animal1.swims();
        animal1.flies();
        Pet catVasya = new Pet("Вася");
        catVasya.addMobilityType(RUNNING);
        catVasya.addMobilityType(JUMPING);
        catVasya.addMobilityType(SWIMMING);
        catVasya.addMobilityType(GOING);
        System.out.printf("\nКот %s ", catVasya.getName());
        for (MobilityTypes mb: catVasya.getMobilityTypes()) {
            System.out.printf("%s ", mb);
        }
        Giraffe giraffe1 = new Giraffe();
        giraffe1.swims();
        giraffe1.goes();
        giraffe1.flies();
        Bat bat1 = new Bat();
        bat1.swims();
        bat1.flies();
        bat1.goes();
        Fish fish1 = new Fish();
        fish1.swims();
        fish1.flies();
        fish1.goes();
        Giraffe giraffe2 = new Giraffe();
        giraffe2.swimsAlternatively();
        giraffe2.goesAlternatively();
        giraffe2.fliesAlternatively();
    }
}

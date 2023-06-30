package HOMEWORK1.animalsWorld;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static HOMEWORK1.animalsWorld.CoverTypes.WOOL;
import static HOMEWORK1.animalsWorld.MobilityTypes.*;

public class Animal {
    private String animalType;
    private CoverTypes coverType;
    private LimbsTypes limbsType1;
    private int qtyOfType1Limbs;
    private LimbsTypes limbsType2;
    private int qtyOfType2Limbs;
    private boolean ifTailIs;
    private RespiratoryOrgans respiratoryOrgan;
    private HashSet<MobilityTypes> mobilityType;


    public Animal (String animalType, CoverTypes coverType, LimbsTypes limbsType1,
                   int qtyOfType1Limbs, LimbsTypes limbsType2, int qtyOfType2Limbs, boolean ifTailIs,
                   RespiratoryOrgans respiratoryOrgan, HashSet<MobilityTypes> mobilityType) {
        this.animalType = animalType;
        this.coverType = coverType;
        this.limbsType1 = limbsType1;
        this.qtyOfType1Limbs = qtyOfType1Limbs;
        this.limbsType2 = limbsType2;
        this.qtyOfType2Limbs = qtyOfType2Limbs;
        this.ifTailIs = ifTailIs;
        this.respiratoryOrgan = respiratoryOrgan;
        this.mobilityType = new HashSet<>(mobilityType.stream().toList());
    }

    public Animal () {
        this(null, null, null, 0, null, 0,
                false, null, new HashSet<>());
    }
    public String toString() {
        return String.format("ANIMAL: \n\t%-25s: %-10s\n\t%-25s: %-10s\n\t%-25s: %-10s\n\t%-25s: %-10d\n\t%-25s: %-10s" +
                "\n\t%-25s: %-10d\n\t%-25s: %-10s\n\t%-25s: %-10s\n\t%-25s: %-10s\n", "Тип животного", animalType, "Покров", coverType,
                "Тип конечностей 1 ", limbsType1, "Кол-во конечностей типа 1", qtyOfType1Limbs, "Тип конечностей 2 ",limbsType2,
                "Кол-во конечностей типа 2", qtyOfType2Limbs, "Наличие хвоста", ifTailIs,
                "Орган дыхания", respiratoryOrgan, "Способ передвижения", mobilityType);
    }
    public HashSet<MobilityTypes> getMobilityTypes() {
//        System.out.println(mobilityType);
        return mobilityType;
    }
    public void addMobilityType(MobilityTypes mt) {
        this.mobilityType.add(mt);
    }
    public void goes () {
        System.out.printf("%s идет... \n", animalType);
    }
    public void flies() {
        System.out.printf("%s летит... \n", animalType);
    }
    public void swims () {
        System.out.printf("%s плывет... \n", animalType);
    }
    public void goesAlternatively () {
        if (this.mobilityType.contains(GOING)) {
            System.out.printf("%s идет... \n", animalType);
        } else {
            System.out.printf("%s не ходит... \n", animalType);
        }
    }
    public void fliesAlternatively () {
        if (this.mobilityType.contains(FLYING)) {
            System.out.printf("%s летит... \n", animalType);
        } else {
            System.out.printf("%s не летает... \n", animalType);
        }
    }
    public void swimsAlternatively () {
        if (this.mobilityType.contains(SWIMMING)) {
            System.out.printf("%s плывет... \n", animalType);
        } else {
            System.out.printf("%s не плавает... \n", animalType);
        }
    }
}

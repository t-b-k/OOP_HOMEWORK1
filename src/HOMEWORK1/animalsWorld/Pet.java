package HOMEWORK1.animalsWorld;

import java.util.Date;

public class Pet extends Animal {
    private Owner petOwner;
    private String petName;
    private Date dateOfBirth;
    private int petAge;

    public Pet () {
        super();
        this.petOwner = null;
        this.petName = null;
        this.dateOfBirth = null;
        this.petAge = 0;
    }
    public Pet (String petName) {
        super();
        this.petOwner = null;
        this.petName = petName;
        this.dateOfBirth = null;
        this.petAge = 0;
    }
    public String getName () {
        return this.petName;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }
}

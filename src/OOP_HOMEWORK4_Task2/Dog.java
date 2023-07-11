package OOP_HOMEWORK4_Task2;

public class Dog {
    public static Integer nextDogID = 0;

    private Integer dogID;
    private String dogBreed;
    private String dogName;
    private int dogAge;

    public Dog (Integer dogID, String dogBreed, String dogName, int dogAge) {
        this.dogID = dogID;
        this.dogBreed = dogBreed;
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    @Override
    public String toString() {
        return String.format("%d: %s %s, %d лет", dogID, dogBreed, dogName, dogAge);
    }
}

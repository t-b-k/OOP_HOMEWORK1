package OOP_HOMEWORK4_Task2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//            FileRepository<Integer, Integer> intStore = new FileRepository<Integer, Integer>();
//            System.out.println(intStore.getTxtFile());
//            System.out.println(intStore.getClassOfStoredObjects());
        Dog dog1 = new Dog(1, "Цвергшнауцер", "Себастьян", 14);
        System.out.println(dog1);
        FileRepository <Integer, Dog> dogsRepository = new FileRepository<Integer, Dog>();
        dogsRepository.addString(dog1.toString());
    }
}

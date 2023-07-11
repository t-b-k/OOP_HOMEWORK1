package OOP_HOMEWORK4;

public class Main {
    public static void main(String[] args) {
            FileRepository<Integer, Integer> intStore = new FileRepository<Integer, Integer>("Integer");
            System.out.println(intStore.getTxtFile());
            System.out.println(intStore.getClassOfStoredObjects());
    }
}

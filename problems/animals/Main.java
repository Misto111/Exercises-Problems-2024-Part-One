package animals;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Cat("Crazy", "Whiskas");
        animal = new Dog("Hachi","Боклуци от улицата");

        System.out.println(animal.explainSelf());
    }
}

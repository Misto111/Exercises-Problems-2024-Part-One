package factoryDP;

public class Main {
    public static void main(String[] args) {


        Cake cake = CakeFactory.createCake();



        System.out.println(cake.toString());
    }
}

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        String outfit = "";
        String shoes = "";


        boolean degreesCaseOne = degrees >= 10 && degrees <= 18;
        boolean degreesCaseTwo = degrees >18 && degrees <= 24;
        boolean degreesCaseThree = degrees >= 25;

        if (time.equals("Morning")) {
            if (degreesCaseOne) {

                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degreesCaseTwo) {

                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (degreesCaseThree) {

                outfit = "T-Shirt";
                shoes = "Sandals";
            }


        } else if (time.equals("Afternoon")) {
            if (degreesCaseOne){

                outfit = "Shirt";
                shoes = "Moccasins";

            } else if (degreesCaseTwo) {

                outfit = "T-Shirt";
                shoes = "Sandals";

            } else if (degreesCaseThree) {

                outfit = "Swim Suit";
                shoes = "Barefoot";
            }

        }else if (time.equals("Evening")){
            if (degreesCaseOne) {

                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degreesCaseTwo) {

                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degreesCaseThree) {

                outfit = "Shirt";
                shoes = "Moccasins";

            }

        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }



}

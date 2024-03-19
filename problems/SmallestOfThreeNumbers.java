import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        System.out.println(printSmallestNumber(numberOne, numberTwo, numberThree));
    }

    private static int printSmallestNumber(int numberOne, int numberTwo, int numberThree) {
        int searchedNum = 0;
        if (numberOne < numberTwo && numberOne < numberThree) {

            searchedNum = numberOne;

        } else if (numberTwo < numberOne && numberTwo < numberThree) {
            searchedNum = numberTwo;

        } else {

            searchedNum = numberThree;

        }

        return searchedNum;
    }
}

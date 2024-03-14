import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int smallListSize = Math.min(firstList.size(), secondList.size());

        List<Integer> finallist = new ArrayList<>();



            for (int i = 0; i < smallListSize; i++) {

                finallist.add(firstList.get(i));
                finallist.add(secondList.get(i));


            }


        if (firstList.size() > secondList.size()) {
            for (int i = secondList.size(); i <= firstList.size() - 1; i++) {

                finallist.add(firstList.get(i));

            }
        } else {
            for (int i = firstList.size(); i <= secondList.size() - 1; i++) {

                finallist.add(secondList.get(i));
            }



        }
        for (int i = 0; i <= finallist.size() - 1; i++) {
            System.out.print(finallist.get(i) + " ");
        }


    }
}


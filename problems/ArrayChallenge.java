package January2025;
import java.util.Arrays;

public class ArrayChallenge {
//    Масив с 11 различни числа. Не е сортиран. Да се намери онзи елемент, за който 3 са по-малки, а останалите са по-големи.
    public static void main(String[] args) {


        int[] array = {1, 11, 4, 17, 13, 45, 9, 3, 7, 8, 12};


        Arrays.sort(array);


        System.out.println(array[3]);

    }
}

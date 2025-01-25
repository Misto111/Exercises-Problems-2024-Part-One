package January2025;

public class CombineTwoArrays {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int array3Length = array1.length + array2.length;


        int[] array3 = new int[array3Length];


        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }


        for (int j = 0; j < array2.length; j++) {
            array3[array1.length + j] = array2[j];
        }

        for (int i = 0; i < array3Length; i++) {
            System.out.print(array3[i] + ", ");
        }
    }
}

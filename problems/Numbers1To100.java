package cycles;

public class Numbers1To100 {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            stringBuilder.append(i).append(System.lineSeparator());
        }

        System.out.println(stringBuilder);
    }
}


import javax.crypto.spec.PSource;
import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());

        double bgnConvertor = usd * 1.79549;

        System.out.println(bgnConvertor);
    }
}

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int overnightStay = Integer.parseInt(scanner.nextLine());

        double studioSum = 0;
        double apartmentSum = 0;

        switch (month) {
            case "May":
            case "October":
                studioSum = overnightStay * 50;
                apartmentSum = overnightStay * 65;

                if (overnightStay > 7 && overnightStay <= 14) {
                    studioSum = studioSum - (studioSum * 0.05);
                } else if (overnightStay > 14) {
                    studioSum = studioSum - (studioSum * 0.3);
                    apartmentSum = apartmentSum - (apartmentSum * 0.1);
                }
                break;
            case "June":
            case "September":
                studioSum = overnightStay * 75.2;
                apartmentSum = overnightStay * 68.7;

                if (overnightStay > 14) {
                    studioSum = studioSum - (studioSum * 0.2);
                    apartmentSum = apartmentSum - (apartmentSum * 0.1);
                }
                break;
            case "Juli":
            case "August":
            case "November":
                studioSum = overnightStay * 76;
                apartmentSum = overnightStay * 77;

                if (overnightStay > 14) {
                    apartmentSum = apartmentSum - (apartmentSum * 0.1);
                }


        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentSum);
        System.out.printf("Studio: %.2f lv.", studioSum);
    }
}

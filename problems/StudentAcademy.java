package setsAndMaps;
import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentAcademy = new LinkedHashMap<>();

        for (int i = 1; i <= countStudents; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

           if (!studentAcademy.containsKey(studentName)) {
               studentAcademy.put(studentName, new ArrayList<>());
           }

           studentAcademy.get(studentName).add(grade);
        }

        Map<String, Double> averageStudentsGrades = new LinkedHashMap<>();

        for(Map.Entry<String, List<Double>> entry : studentAcademy.entrySet()) {
            String studentName = entry.getKey();
            List<Double> listGrades = entry.getValue();
            double averageGrade = getAverageGrade(listGrades);

            if (averageGrade >= 4.50) {
                averageStudentsGrades.put(studentName, averageGrade);
            }

        }
        averageStudentsGrades.entrySet().forEach(entry-> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> listGrades) {
        double sum = 0;
        for(Double grade : listGrades) {
            sum += grade;
        }
        return sum / listGrades.size();
    }
}

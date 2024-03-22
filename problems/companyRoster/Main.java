package companyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Employee> employees = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            if (data.length == 5) {

                if (data[4].contains("@")) {
                    String name = data[0];
                    double salary = Double.parseDouble(data[1]);
                    String position = data[2];
                    String department = data[3];
                    String email = data[4];

                    Employee employee = new Employee(name, salary, position, department, email);
                    employees.add(employee);

                } else {
                    String name = data[0];
                    double salary = Double.parseDouble(data[1]);
                    String position = data[2];
                    String department = data[3];
                    int age = Integer.parseInt(data[4]);

                    Employee employee = new Employee(name, salary, position, department, age);
                    employees.add(employee);

                }

            } else if (data.length == 4) {
                String name = data[0];
                double salary = Double.parseDouble(data[1]);
                String position = data[2];
                String department = data[3];

                Employee employee = new Employee(name, salary, position, department);
                employees.add(employee);

            } else {

                String name = data[0];
                double salary = Double.parseDouble(data[1]);
                String position = data[2];
                String department = data[3];
                String email = data[4];
                int age = Integer.parseInt(data[5]);

                Employee employee = new Employee(name, salary, position, department, email, age);
                employees.add(employee);

            }


        }

        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(employee -> System.out.println(employee.toString()));

        //employees.forEach(employee -> System.out.println(employee.toString()));
    }

}

package prototypeDP;

public class EmployeeRecord implements Prototype{

    private int id;
    private String name;
    private String department;
    private double salary;
    private String address;


    public EmployeeRecord(int id, String name, String department, double salary, String address) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.address = address;
    }
    public void showRecord() {

        System.out.printf("%d %s %s %.2f %s\n", id, name, department, salary, address);
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(id, name, department, salary, address);
    }
}

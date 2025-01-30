package January2025.Customers;

public class Customer {

    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public Customer setName(String name) {
        this.name = name;
        return this;
    }
    public int getAge() {
        return age;
    }
    public  Customer setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Customer: " + getName()  + ", age : " + getAge();
    }
}

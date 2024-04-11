package builderDP;

public class Contact {
    private String name;
    private String number;
    private String company;
    private String title;
    private String email;
    private String website;
    private String birthday;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public  Contact withCompany(String company) {
        this.company = company;
        return this;
    }

    public Contact withTitle(String bauBau) {
        this.title = bauBau;
        return this;
    }

    @Override
    public String toString() {
        return String.format("The manager %s with company %s have title %s.", this.name, this.company, this.title);
    }
}

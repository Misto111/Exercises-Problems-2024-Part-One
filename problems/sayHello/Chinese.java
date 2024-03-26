package sayHello;



public class Chinese extends PersonImpl {

    public Chinese(String name) {
        super(name);
    }

    public String sayHello() {
        return "Ma!";
    }
}

package factoryDP;

public class Cake{
    public double diameter;
    public double price;
    public int pieces;
    public String type;

    public Cake(double diameter, double price, int pieces, String type) {
        this.diameter = diameter;
        this.price = price;
        this.pieces = pieces;
        this.type = type;

    }

    public void prepare() {

        System.out.println("Prepare cake");
    }


    public void bake() {

        System.out.println("Bake cake");
    }


    public void box() {

        System.out.println("Box cake");

    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("This is a %s cake delivery.", this.getType());
    }
}

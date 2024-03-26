package carShopExtend;

public class Seat extends CarImpl implements Sellable{
    Double price;

    public Seat(String model, String color, Integer horsepower, String countryProduce, Double price) {
        super(model, color, horsepower, countryProduce);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return null;
    }
}

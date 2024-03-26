package carShopExtend;

public class CarImpl implements Car {
    private String model;
    private String color;
    private Integer horsepower;
    private String countryProduce;

    public CarImpl(String model, String color, Integer horsepower, String countryProduce) {
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
        this.countryProduce = countryProduce;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsepower;
    }

    @Override
    public String countryProduce() {
        return this.countryProduce;
    }
    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires.", this.model, this.countryProduce, Car.TIRES);
    }
}

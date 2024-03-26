package carShopExtend;

public class Audi extends CarImpl implements Rentable{

    Integer minRentDay;
    Double pricePerDay;

    public Audi(String model, String color, Integer horsepower, String countryProduce, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsepower, countryProduce);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;


    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }
}

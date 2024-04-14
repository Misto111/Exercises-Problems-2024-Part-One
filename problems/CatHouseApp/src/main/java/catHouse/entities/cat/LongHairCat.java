package catHouse.entities.cat;

public class LongHairCat extends BaseCat{

    private static final int LONG_HAIR_CAT_KILOGRAMS = 7;

    public LongHairCat(String name, String breed, double price) {
        super(name, breed, LONG_HAIR_CAT_KILOGRAMS, price);
    }

    @Override
    public void eating() {
        this.setKilograms(this.getKilograms() + 3);

    }
}

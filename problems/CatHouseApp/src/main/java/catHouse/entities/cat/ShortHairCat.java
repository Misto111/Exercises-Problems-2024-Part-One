package catHouse.entities.cat;

public class ShortHairCat extends BaseCat {

    private static final int SHORT_HAIR_CAT_KILOGRAMS = 7;

    public ShortHairCat(String name, String breed, double price) {
        super(name, breed, SHORT_HAIR_CAT_KILOGRAMS, price);
    }

    @Override
    public void eating() {
        this.setKilograms(this.getKilograms() + 1);
    }
}

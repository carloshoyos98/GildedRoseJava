package Domain;

public class Conjured extends NormalItem implements Updateable {

    public Conjured(String name, Integer sell_in, Integer quality) {
        super(name, sell_in, quality);
    }

    @Override
    public Integer update_quality() {
        if (this.sell_in >= 0)
            setQuality(-2);
        else
            setQuality(-4);
        return this.quality;
    }
}

package Domain;

public class Item {

    protected String name = "";
    protected Integer sell_in = 0;
    protected Integer quality = 0;

    public Item(String name, Integer sell_in, Integer quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name.toString() + this.sell_in.toString() + this.quality.toString();
    }

    public String getName() {
        return this.name;
    }

    public Integer getSell_in() {
        return this.sell_in;
    }

    public Integer getQuality() {
        return this.quality;
    }
}

package Domain;

public class NormalItem extends Item implements Updateable{

    public NormalItem(String name, Integer sell_in, Integer quality) {
        super(name, sell_in, quality);
    }
    public Integer setSellin() {
        this.sell_in = this.sell_in - 1;
        return this.sell_in;
    }

    public Integer setQuality( Integer valor) {

        if (this.quality + valor > 50)
            this.quality = 50;
        else if (this.quality + valor >= 0)
            this.quality = this.quality + valor;
        else
            this.quality = 0;
        return this.quality;
    }

    @Override
    public Integer update_quality() {
        setSellin();
        if(this.sell_in > 0)
            setQuality(-1);
        else
            setQuality(-2);
        return this.quality;
    }
}

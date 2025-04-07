package ro.acs.clase;

public abstract class ASticker implements Cloneable {
    protected int dimensiune;
    protected String culoare;

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ASticker sticker= (ASticker) super.clone();
        sticker.culoare=this.culoare;
        sticker.dimensiune=this.dimensiune;
        return sticker;
    }
}

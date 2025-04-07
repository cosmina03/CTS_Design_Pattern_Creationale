package ro.acs.clase;

public class Sticker extends ASticker {
    public Sticker(Masina m,int dimensiune) {
        this.dimensiune=dimensiune;
        this.culoare="negre";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ASticker sticker= (ASticker) super.clone();
        sticker.culoare=this.culoare;
        sticker.dimensiune=this.dimensiune;
        return sticker;
    }
    //    Sticker(Masina m){
//        System.out.println("Apel pentru masina"+m.getCodUnic());
//        this.listaDimensiuni="lista dimensiuni "+m.getCodUnic();
//        this.culoare="default";
//    }
//
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Sticker{");
//        sb.append("listaDimensiuni='").append(listaDimensiuni).append('\'');
//        sb.append(", culoare='").append(culoare).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
//
//    public Sticker setCuloare(String culoare) {
//        this.culoare = culoare;
//        return this;
//    }
//
//    @Override
//    public Sticker clone() throws CloneNotSupportedException {
//        Sticker clona=(Sticker) super.clone();//shallowCopy
//        //pt deep copy:
//        clona.listaDimensiuni=new String(this.listaDimensiuni);
//        clona.culoare=new String(this.culoare);
//        return clona;
//    }
}

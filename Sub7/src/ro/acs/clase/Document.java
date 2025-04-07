package ro.acs.clase;

public class Document implements IDocument{
    private int nrPagini;
    private boolean isColor;
    private String text;


    public Document(int nrPagini, boolean isColor, String text) {
        this.nrPagini = nrPagini;
        this.isColor = isColor;
        this.text = text;
    }

    @Override
    public int getNrPagini() {
        return this.nrPagini;
    }

    @Override
    public boolean isColor() {
        return this.isColor;
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public void afisareDocument() {
        System.out.println(this.text);
    }
}

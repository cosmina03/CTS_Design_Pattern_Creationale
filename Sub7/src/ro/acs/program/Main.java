package ro.acs.program;

import ro.acs.clase.Document;
import ro.acs.clase.IDocument;
import ro.acs.clase.Imprimanta;
import ro.acs.clase.TipPrintare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IDocument document=new Document(100,true,"jdsbfbfoad");
        IDocument document1=new Document(77,false,"e alb negru");
        Imprimanta.printeaza(document, 1, document.getNrPagini(), TipPrintare.COLOR);
        Imprimanta.afisareTonerDisponibil();
        Imprimanta.printeaza(document1,4, document.getNrPagini(), TipPrintare.ALBNEGRU);
        Imprimanta.afisareTonerDisponibil();
        Imprimanta.printeaza(document, 1, document.getNrPagini(), TipPrintare.COLOR);
        Imprimanta.afisareTonerDisponibil();
       // Imprimanta.printeaza(document, 1, document.getNrPagini(), TipPrintare.COLOR);
      //  Imprimanta.afisareTonerDisponibil();
        Imprimanta.printeaza(document,1,30,TipPrintare.ALBNEGRU);
        Imprimanta.afisareTonerDisponibil();

        System.out.println(Imprimanta.registry());
        Imprimanta imprimanta=Imprimanta.getInstanceImprimanta(2);
        System.out.println(imprimanta.toString());



    }
}
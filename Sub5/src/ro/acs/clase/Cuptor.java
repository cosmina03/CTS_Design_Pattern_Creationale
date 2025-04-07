package ro.acs.clase;

import java.util.ArrayList;
import java.util.List;

public class Cuptor extends ACuptor{
    //Static bloc -lazy
    private static  Cuptor instance=null;
    private int gradeMaxime;
    private List<Comanda> listaAsteptare;

    private Cuptor() {
        this.gradeMaxime = 280;
        this.listaAsteptare = new ArrayList<>();
    }
    static {
        instance=new Cuptor();
    }
    public static Cuptor getInstance(){
        return instance;
    }

    @Override
    public int getGradeMaxime() {
        return this.gradeMaxime;
    }

    @Override
    public int getTimpAsteptare() {
        int timp=0;
        for(Comanda comanda : listaAsteptare){
            timp+=comanda.getTimpGatire();
        }
        return timp;
    }

    @Override
    public void afisareComenziAsteptare() {
        for(Comanda c : listaAsteptare){
            System.out.println(c.toString());
        }

    }

    @Override
    public void addComanda(Comanda c) {
        if(this.gradeMaxime<c.getGradeGatire()){
            throw new ExceptieGatire("Nu avem cuptor potrivit");
        }
        listaAsteptare.add(c);
    }


//    private int gradeCuptor;
//    private List<Comanda> listAsteptare=new ArrayList<>();
//
//    private static Cuptor instance=null;
//
//    private Cuptor(int gradeCuptor, List<Comanda> listAsteptare) {
//        this.gradeCuptor = gradeCuptor;
//        this.listAsteptare = listAsteptare;
//    }
//
//    static {
//        instance=new Cuptor(200,new ArrayList<>());
//    }
//
//    public static Cuptor getInstance(){
//        return instance;
//    }
//
//    @Override
//    public int getGradeMaxime() {
//        return gradeCuptor;
//    }
//
//    @Override
//    public int getTimpAsteptare() {
//        int timp=0;
//        for(Comanda c : listAsteptare){
//            timp+=c.getTimpGatire();
//        }
//        return timp;
//    }
//
//    @Override
//    public void afisareComenziAsteptare() {
//        for(Comanda c : listAsteptare){
//            System.out.println(c.toString());
//        }
//
//    }
//
//    @Override
//    public void addComanda(Comanda c) {
//        if(this.gradeCuptor<c.getGradeGatire()){
//            throw new ExceptieGatire("Greseala");
//        }
//        listAsteptare.add(c);
//
//    }

}

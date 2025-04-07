package ro.acs.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cuptor extends ACuptor{
    private static Map<Integer,Cuptor> cuptorMap=null;

    //atributele fiecarui cuptor in parte
    private int id;
    private int nrGradeMaxime;
    private List<Comanda> listaAsteptare;
    static{
        cuptorMap=new HashMap<>();
        cuptorMap.put(1,new Cuptor(1,180));
        cuptorMap.put(2,new Cuptor(2,200));
        cuptorMap.put(3,new Cuptor(3,240));
        cuptorMap.put(4, new Cuptor(4,300));
    }

    private Cuptor(int id, int nrGradeMaxime) {
        this.id = id;
        this.nrGradeMaxime = nrGradeMaxime;
        this.listaAsteptare = new ArrayList<>();
    }

    @Override
    public int getGradeMaxime() {
        return this.nrGradeMaxime;
    }

    @Override
    public int getTimpAsteptare() {
        int timp=0;
        for(Comanda c:this.listaAsteptare){
            timp=timp+ c.getTimpGatire();
        }
        return timp;
    }

    @Override
    public void afisareComenziAsteptare() {
        for(Cuptor c : cuptorMap.values()){
            System.out.println(c.toString());
        }

    }

    public static void afisareComenzi() {
        for(Cuptor c : cuptorMap.values()){
            System.out.println(c.toString());
        }

    }

    public static void addComanda(Comanda c) {

        Cuptor cuptorMinim=null;
        int timpMinim=Integer.MAX_VALUE;
        for(Cuptor cuptor : cuptorMap.values()){
            if(cuptor.getGradeMaxime()>=c.getGradeGatire()){
                int timpCurent= cuptor.getTimpAsteptare();
                if(timpCurent<timpMinim){
                    timpMinim=timpCurent;
                    cuptorMinim=cuptor;
                }

            }
        }
        if(cuptorMinim!=null){
            cuptorMinim.listaAsteptare.add(c);
        }else{
            System.out.println("Nu avem cuptor cu atat de multe grade");
        }


//        Cuptor cuptorMinim=null;
//        int timpMinim=Integer.MAX_VALUE;
//
//        for(Cuptor cuptor : cuptorMap.values()) {
//            //verific daca cuptorul poate gati preparatul
//            if (cuptor.nrGradeMaxime >= c.getGradeGatire()) {
//                int timpCurent = cuptor.getTimpAsteptare();
//                if (timpCurent < timpMinim) {
//                    timpMinim = timpCurent;
//                    cuptorMinim = cuptor;
//                }
//            }
//        }
//        if (cuptorMinim != null) {
//            cuptorMinim.listaAsteptare.add(c);
//            System.out.println("Preparatul " + c + " a fost asignat cuptorului " + cuptorMinim.id);
//        }else {
//            System.out.println("Nu există cuptor disponibil pentru preparatul " + c);
//        }
//
//

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuptor{");
        sb.append(", id=").append(id);
        sb.append(", nrGradeMaxime=").append(nrGradeMaxime);
        sb.append(", listaAsteptare=").append(listaAsteptare);
        sb.append('}');
        return sb.toString();
    }
}

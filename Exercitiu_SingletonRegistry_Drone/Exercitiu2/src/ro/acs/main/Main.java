package ro.acs.main;

import ro.acs.clase.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RaportFactory factory=new RaportFactory();
        RaportAlertare raportAlertare= (RaportAlertare) factory.getRaport(TipRaport.ALERTARE);
        raportAlertare.emiteRaport();
        RaportAvertizare raportAvertizare= (RaportAvertizare) factory.getRaport(TipRaport.AVERTIZARE);
        raportAvertizare.emiteRaport();
        RaportInformare raportInformare=(RaportInformare) factory.getRaport(TipRaport.INFORMARE);
        raportInformare.emiteRaport();
        RaportInformare raportInformare1=(RaportInformare) factory.getRaport(TipRaport.INFORMARE);
        raportInformare1.emiteRaport();

    }
}
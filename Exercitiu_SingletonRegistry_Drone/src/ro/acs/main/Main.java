package ro.acs.main;

import ro.acs.clase.BaseControl;
import ro.acs.clase.DronaConexiuni;
import ro.acs.clase.SatelitGPS;
import ro.acs.clase.ServiciuWeb;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DronaConexiuni dronaConexiuni=new DronaConexiuni();
        DronaConexiuni dronaConexiuni1=new DronaConexiuni();
        //System.out.println(dronaConexiuni1==dronaConexiuni);
        BaseControl control= (BaseControl) dronaConexiuni1.getSingleton(DronaConexiuni.BASE);
        BaseControl control1= (BaseControl) dronaConexiuni.getSingleton(DronaConexiuni.BASE);

        SatelitGPS satelitGPS= (SatelitGPS) dronaConexiuni.getSingleton(DronaConexiuni.SATELIT);
        ServiciuWeb serviciuWeb=(ServiciuWeb) dronaConexiuni.getSingleton(DronaConexiuni.SERVICIU);
        ServiciuWeb serviciuWeb1= (ServiciuWeb) dronaConexiuni1.getSingleton(DronaConexiuni.SERVICIU);
        System.out.println(control1==control);
        System.out.println(serviciuWeb1==serviciuWeb);
    }
}
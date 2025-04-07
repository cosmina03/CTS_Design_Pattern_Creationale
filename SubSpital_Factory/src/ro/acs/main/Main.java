package ro.acs.main;

import ro.acs.clase.AbstractPersonal;
import ro.acs.fabrici.CrearePersonal;
import ro.acs.fabrici.PersonalMedical;
import ro.acs.fabrici.PersonalMedicalFactory;
import ro.acs.fabrici.PersonalNonMedicalFactory;

public class Main {
    public static void main(String[] args) {
        CrearePersonal factoryPersonalMedical=new PersonalMedicalFactory(90);
        CrearePersonal factoryPersonalNonMedical=new PersonalNonMedicalFactory(70);
        AbstractPersonal asistent=factoryPersonalMedical.getPersonal(PersonalMedical.Asistent,"Gigel",10);
        System.out.println(asistent);

    }
}

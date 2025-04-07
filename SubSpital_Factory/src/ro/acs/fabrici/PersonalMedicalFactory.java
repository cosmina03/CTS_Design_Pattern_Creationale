package ro.acs.fabrici;

import ro.acs.clase.AbstractPersonal;
import ro.acs.clase.Medic;

public class PersonalMedicalFactory extends CrearePersonal{
    private int sporMedical;

    public PersonalMedicalFactory(int sporMedical) {
        this.sporMedical = sporMedical;
    }

    @Override
    public AbstractPersonal getPersonal(TipPersonal tip, String nume, int vechime) {
        switch (tip){
            case PersonalMedical.Medic -> {return new Medic(nume,vechime,this.sporMedical);
            }
            case PersonalMedical.Asistent -> {return new Medic(nume,vechime,40);
            }
            case PersonalMedical.Bracardier -> {return new Medic(nume,vechime,sporMedical);}
            default -> {return null;}
        }

    }
}

package ro.acs.fabrici;

import ro.acs.clase.AbstractPersonal;
import ro.acs.clase.Secretar;

public class PersonalNonMedicalFactory extends CrearePersonal {
    private int sporNonMedical;

    public PersonalNonMedicalFactory(int sporNonMedical) {
        this.sporNonMedical = sporNonMedical;
    }

    @Override
    public AbstractPersonal getPersonal(TipPersonal tip, String nume, int vechime) {
        switch (tip){
            case TipPersonalNonMedical.Registrator -> {return new Secretar(nume,vechime,sporNonMedical);
            }
            case TipPersonalNonMedical.Secretar -> {return new Secretar(nume,vechime,sporNonMedical);}
            default -> {return null;
            }
        }
    }
}

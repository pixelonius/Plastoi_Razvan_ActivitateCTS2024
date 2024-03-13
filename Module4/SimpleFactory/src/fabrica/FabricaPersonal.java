package src.fabrica;

import src.classes.*;

public class FabricaPersonal {

    public PersonalSpital createPersonalSpital(TipPersonal tipPersonal, String nume, int salariu) throws Exception{
        return switch (tipPersonal) {
            case MEDIC -> new Medic(nume, salariu);
            case ASISTENT -> new Asistent(nume, salariu);
            case BRANCARDIER -> new Brancardier(nume, salariu);
            case INFIRMIER -> new Infirmier(nume, salariu);
            default -> throw new Exception("Tipul nu este returnat");
        };
    }
}

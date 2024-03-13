package Main;

import src.classes.PersonalSpital;
import src.fabrica.FabricaPersonal;
import src.fabrica.TipPersonal;

public class Main {
    public static void main(String[] args) throws Exception {
        FabricaPersonal fabricaPersonal = new FabricaPersonal();
        PersonalSpital medic = fabricaPersonal.createPersonalSpital(TipPersonal.MEDIC, "Maria", 10000);
        PersonalSpital infirmier = fabricaPersonal.createPersonalSpital(TipPersonal.INFIRMIER, "Ioana", 10000);
        PersonalSpital asistent = fabricaPersonal.createPersonalSpital(TipPersonal.ASISTENT, "Ionel", 12345);
        PersonalSpital brancardier = fabricaPersonal.createPersonalSpital(TipPersonal.BRANCARDIER, "Laur", 10000);

        medic.afisareDetalii();
        infirmier.afisareDetalii();
        asistent.afisareDetalii();
        brancardier.afisareDetalii();
    }
}

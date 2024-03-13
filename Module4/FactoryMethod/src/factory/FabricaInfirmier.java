package src.factory;

import src.classes.Infirmier;
import src.classes.PersonalSpital;

public class FabricaInfirmier implements FabricaPersonal {

    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}

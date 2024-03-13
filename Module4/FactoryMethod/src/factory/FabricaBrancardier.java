package src.factory;

import src.classes.Brancardier;
import src.classes.PersonalSpital;

public class FabricaBrancardier implements FabricaPersonal {

    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Brancardier(nume, salariu);
    }
}

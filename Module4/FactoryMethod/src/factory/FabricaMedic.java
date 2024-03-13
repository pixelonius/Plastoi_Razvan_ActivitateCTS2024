package src.factory;

import src.classes.Medic;
import src.classes.PersonalSpital;

public class FabricaMedic implements FabricaPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}

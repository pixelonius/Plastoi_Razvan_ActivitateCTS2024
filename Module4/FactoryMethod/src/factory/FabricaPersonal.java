package src.factory;

import src.classes.PersonalSpital;

public interface FabricaPersonal {
    PersonalSpital createPersonal(String nume, int salariu);
}

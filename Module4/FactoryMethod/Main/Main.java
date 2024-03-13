package Main;

import src.classes.PersonalSpital;
import src.factory.*;

public class Main {

    public static void prelucrarePersonal(FabricaPersonal fabrica, String nume, int salariu) {
        PersonalSpital personalSpital = fabrica.createPersonal(nume, salariu);
        personalSpital.afisareDetalii();
    }

    public static void main(String[] args) {

        prelucrarePersonal(new FabricaAsistent(), "Ionel", 1000);
        prelucrarePersonal(new FabricaBrancardier(), "Ana", 2000);
        prelucrarePersonal(new FabricaMedic(), "Claudia", 5000);
        prelucrarePersonal(new FabricaInfirmier(), "Teodor", 1500);
    }
}

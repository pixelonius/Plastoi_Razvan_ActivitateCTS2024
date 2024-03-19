package main;

import classes.Pacient;
import classes.Pacient.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder=new PacientBuilder();
        Pacient pacient3=pacientBuilder.setPatRabatabil(true).setMicdejunInclus(true).setPapuci(true).setHalat(true).build();
        System.out.println(pacient3.toString());

    }
}
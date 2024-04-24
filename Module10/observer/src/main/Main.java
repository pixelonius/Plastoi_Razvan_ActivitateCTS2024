package main;

import clase.Abonat;
import clase.Obsever;
import clase.Vecin;
import subject.Sala;
import subject.Stadion;
import subject.Subject;


public class Main {
    public static void main(String[] args) {
        Obsever abonat1=new Abonat("Gigel1");
        Obsever abonat2=new Abonat("Gigel2");
        Obsever abonat3=new Abonat("Gigel3");
        Vecin vecin=new Vecin("Gigelvecin",20);
        Subject sala=new Sala() ;
        sala.adaugaAbonat(abonat1);
        sala.adaugaAbonat(abonat2);
        sala.adaugaAbonat(abonat3);
        sala.notificaMeciFotbal();
        sala.stergeAbonat(abonat2);
        sala.adaugaAbonat(vecin);
        sala.notificaMeciVolei();

        Subject stadion= new Stadion();
        stadion.adaugaAbonat(abonat1);
        stadion.adaugaAbonat(abonat2);
        stadion.adaugaAbonat(abonat3);
        ((Stadion)stadion).notificaConcert();
    }
}
package main;

import classes.Reteta;
import classes.RetetaAbstracta;
import classes.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double> solutii=new HashMap<>();
        solutii.put("solutie1",3.4);
        solutii.put("solutie2",5.5);
        solutii.put("solutie3",3.1);
        Reteta prototip=new Reteta(solutii,"Medicament1");
        RetetaAbstracta reteta2=prototip.clone();
        System.out.println(prototip.toString());
        System.out.println(reteta2.toString());
        RetetaCrema retetaCrema=new RetetaCrema(5,"Crema1");
        RetetaAbstracta retetaCrema1=retetaCrema.clone();
        System.out.println(retetaCrema1.toString());



    }
}
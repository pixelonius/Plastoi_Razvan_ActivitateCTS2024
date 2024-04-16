package main;

import classes.*;

public class Main {
    public static void main(String[] args) {
        Vanzare vanzare=new VanzareBilet("El Clasico",100);
        Persoana pers1=new Persoana("Popa","feminin",22);
        Persoana pers2=new Persoana("Ionescu","feminin",11);

        Vanzare proxyVarsta=new ProxyVarsta(vanzare);
        proxyVarsta.vanzareBilet(pers1);
        proxyVarsta.vanzareBilet(pers2);
        Vanzare proxyGen=new ProxyGen(proxyVarsta,"feminin");
        proxyGen.vanzareBilet(pers1);
        proxyGen.vanzareBilet(pers2);


    }
}
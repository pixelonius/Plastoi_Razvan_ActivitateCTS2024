package main;

import Decorator.Decorator;
import Spital.Diagnostic;
import Spital.DiagnosticAbstract;
import Decorator.AplicatieMobila;
import Decorator.Webstite;
public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract diagnostic=new Diagnostic("Raceala","Tuse, febra si dureri de gat",false);
        diagnostic.printeazaDiagnostic();

       Decorator decorator1=new AplicatieMobila(diagnostic);
       decorator1.afisareOnline();

       Decorator decorator2=new Webstite(diagnostic);
       decorator2.afisareOnline();
    }
}
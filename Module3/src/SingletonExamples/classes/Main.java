package SingletonExamples.classes;

import SingletonExamples.classes.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args){
        ConexiuneBazaDeDate conn1=ConexiuneBazaDeDate.getInstance("Baza1",4,"link1");
        ConexiuneBazaDeDate conn2= ConexiuneBazaDeDate.getInstance("Baza2", 40,"link2");

        conn1.setLinkConn("link1Modificat");

        System.out.println(conn1);
        System.out.println(conn2);
    }
}
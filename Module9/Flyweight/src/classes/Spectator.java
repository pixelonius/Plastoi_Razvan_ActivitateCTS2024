package classes;

import java.util.StringJoiner;

public class Spectator implements Flyweight{
    private int inaltime;
    private int latime;

    public Spectator(int inaltime, int latime) {
        this.inaltime = inaltime;
        this.latime = latime;
    }

    public int getInaltime() {
        return inaltime;
    }

    public int getLatime() {
        return latime;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Spectator.class.getSimpleName() + "[", "]")
                .add("inaltime=" + inaltime)
                .add("latime=" + latime)
                .toString();
    }

    @Override
    public void deseneaza(Caracteristici caracteristici) {
        System.out.println(this.toString()+" "+caracteristici.toString());
    }
}

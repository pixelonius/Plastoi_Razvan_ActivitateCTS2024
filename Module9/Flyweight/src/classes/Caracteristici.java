package classes;

import java.util.StringJoiner;

public class Caracteristici {
    private int pozitieX;
    private int pozitieY;
    private String culoareTricou;

    public Caracteristici(int pozitieX, int pozitieY, String culoareTricou) {
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
        this.culoareTricou = culoareTricou;
    }

    public int getPozitieX() {
        return pozitieX;
    }

    public int getPozitieY() {
        return pozitieY;
    }

    public String getCuloareTricou() {
        return culoareTricou;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Caracteristici.class.getSimpleName() + "[", "]")
                .add("pozitieX=" + pozitieX)
                .add("pozitieY=" + pozitieY)
                .add("culoareTricou='" + culoareTricou + "'")
                .toString();
    }
}

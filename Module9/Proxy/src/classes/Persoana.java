package classes;

public class Persoana {
    private String nume;
    private String gen;
    private int varsta;

    public Persoana(String nume, String gen, int varsta) {
        this.nume = nume;
        this.gen = gen;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getGen() {
        return gen;
    }

    public int getVarsta() {
        return varsta;
    }


}

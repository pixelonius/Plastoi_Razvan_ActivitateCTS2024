package classes;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta {
    private Map<String,Double> solutii;
    private String nume;

    public Reteta(Map<String, Double> solutii, String nume) {
        this.solutii = solutii;
        this.nume = nume;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii=new HashMap<>(10);
        for (String solutie:solutii.keySet()) {
            this.solutii.put(solutie,solutii.get(solutie));
        }

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Reteta() {
        this.nume="nou";
        this.solutii=null;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reteta{");
        sb.append("solutii=").append(solutii);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public RetetaAbstracta clone() {
        Reteta retetaAbstracta=new Reteta();
        retetaAbstracta.setNume(this.nume);
        retetaAbstracta.setSolutii(this.solutii);
        return retetaAbstracta;

    }
}

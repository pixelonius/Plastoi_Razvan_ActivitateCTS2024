package classes;

public class VanzareBilet implements Vanzare {
    private String meci;
    private float pret;

    public VanzareBilet(String meci, float pret) {
        this.meci = meci;
        this.pret = pret;
    }

    @Override
    public void vanzareBilet(Persoana persoana) {
        System.out.println("Persoana "+persoana.getNume()+" a cumparat bilet la meciul"+meci);
    }
}

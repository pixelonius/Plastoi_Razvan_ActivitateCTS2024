package classes;

public class ProxyGen implements Vanzare{
    private Vanzare vanzareBilet;
    private String genPermis;

    public ProxyGen(Vanzare vanzareBilet, String genPermis) {
        this.vanzareBilet = vanzareBilet;
        this.genPermis = genPermis;
    }


    @Override
    public void vanzareBilet(Persoana persoana) {
        if(persoana.getGen().equals(genPermis)) {
           vanzareBilet.vanzareBilet(persoana);
        } else {
            System.out.println("Acest eveniment este destinat doar persoanelor de gen "+genPermis);
        }

    }
}

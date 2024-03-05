package SingletonExamples.classes;

public class ConexiuneBazaDeDate {
    private String numeBaza;
    private int nrTabele;
    private String linkConn;
    private static ConexiuneBazaDeDate instanta=null;


    //in Singleton constructorul trebuie sa fie private, obligatoriu
    private ConexiuneBazaDeDate(String numeBaza, int nrTabele, String linkConn) {
        this.numeBaza = numeBaza;
        this.nrTabele = nrTabele;
        this.linkConn = linkConn;
    }

    public String getNumeBaza() {
        return numeBaza;
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public int getNrTabele() {
        return nrTabele;
    }

    public void setNrTabele(int nrTabele) {
        this.nrTabele = nrTabele;
    }

    public String getLinkConn() {
        return linkConn;
    }

    public void setLinkConn(String linkConn) {
        this.linkConn = linkConn;
    }

    @Override
    public String toString() {
        return "ConexiuneBazaDeDate{" +
                "numeBaza='" + numeBaza + '\'' +
                ", nrTabele=" + nrTabele +
                ", linkConn='" + linkConn + '\'' +
                '}';
    }

    public static synchronized ConexiuneBazaDeDate getInstance(String numeBaza, int nrTabele,
                                                               String linkConn){
        if(instanta==null) {
            instanta = new ConexiuneBazaDeDate(numeBaza, nrTabele, linkConn);
        }

        return instanta;
    }
}

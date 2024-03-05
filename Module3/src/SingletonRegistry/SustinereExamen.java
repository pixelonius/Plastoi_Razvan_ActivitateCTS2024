package SingletonRegistry;

import java.util.*;

public class SustinereExamen {
    private String nume;
    private Map<Integer, Student> listaStud=new HashMap<>();

    public SustinereExamen(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public Map<Integer, Student> getListaStud() {
        return listaStud;
    }

    public void inregistrareStudenti(Student stud){
        if(listaStud.containsKey(stud.getId())){
            System.out.println("Studentul "+stud.getNume()+" nu poate participa la examenul "+nume);
        }
        else{
            listaStud.put(stud.getId(), stud);
            System.out.println("Studentul "+stud.getNume()+" poate participa la examenul "+nume);
        }
    }
}

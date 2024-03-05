package SingletonRegistry;

public class Main {
    public static void main(String[] args){
        Student stud1=new Student(1,"Ionel");
        Student stud2=new Student(2,"GeorgeSaracu");
        Student stud3=new Student(3, "Mihai");
        Student stud4=new Student(4,"Alexandru");

        SustinereExamen examenCts=new SustinereExamen("CTS");
        SustinereExamen examenPoo=new SustinereExamen("POO");

        examenPoo.inregistrareStudenti(stud1);
        examenPoo.inregistrareStudenti(stud2);
        examenPoo.inregistrareStudenti(stud1);

        examenCts.inregistrareStudenti(stud1);



}
}

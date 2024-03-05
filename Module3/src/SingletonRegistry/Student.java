package SingletonRegistry;

public class Student {
    private int id;
    private String nume;

    public Student(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public int getId() {
        return id;
    }
}

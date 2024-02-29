package readers.classes;

import clase.Aplicant;
import clase.Student;
import readers.interfaces.ApplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends ApplicantReader {

    public StudentReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(super.fileName));
        scanner.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (scanner.hasNext()) {
            Student aplicant = new Student();
            super.readAplicant(scanner, aplicant);
            int an_studii = scanner.nextInt();
            String facultate = (scanner.next()).toString();
            aplicant.setFacultate(facultate);
            aplicant.setAn_studii(an_studii);
            studenti.add(aplicant);
        }
        scanner.close();
        return studenti;
    }
}

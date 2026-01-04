import java.util.ArrayList;

public class StudentData {

    public static ArrayList<UniversityStudent> getStudents() {
        ArrayList<UniversityStudent> students = new ArrayList<>();

        students.add(new UniversityStudent("Ringo", "Starr", 2.3));
        students.add(new UniversityStudent("Paul", "McCartney", 3.8));

        return students;
    }
}
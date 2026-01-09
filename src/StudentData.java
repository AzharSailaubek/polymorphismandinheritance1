import java.util.ArrayList;

public class StudentData {

    public static ArrayList<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ringo", "Starr", 2.3));
        students.add(new Student("Paul", "McCartney", 3.8));

        return students;
    }
}
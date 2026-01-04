import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();

        list.add(new Employee("John", "Lennon", "Singer", 27045.78));
        list.add(new Employee("George", "Harrison", "Guitarist", 50000));

        list.addAll(StudentData.getStudents());

        Collections.sort(list);
        printData(list);
    }

    public static void printData(Iterable<Person> persons) {
        for (Person p : persons) {
            System.out.printf(
                    "%s %d: %s %s earns %.2f tenge%n",
                    p.getPosition(),
                    p.getId(),
                    p.getName(),
                    p.getSurname(),
                    p.getPaymentAmount()
            );
        }
    }
}
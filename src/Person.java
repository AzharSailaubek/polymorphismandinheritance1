public class Person implements Payable, Comparable<Person> {

    protected int id;
    protected String name;
    protected String surname;

    protected static int nextId = 1;

    public Person() {
        id = nextId;
        nextId++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return "Student";
    }

    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public double getPaymentAmount() {
        return 0;
    }

    public int compareTo(Person p) {
        return Double.compare(this.getPaymentAmount(), p.getPaymentAmount());
    }
}
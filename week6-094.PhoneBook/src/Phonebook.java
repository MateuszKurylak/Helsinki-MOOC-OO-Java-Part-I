
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> list = new ArrayList<Person>();

    public Phonebook() {
        this.list.clear();
    }

    public void add(String name, String number) {
        Person person = new Person(name, number);
        list.add(person);
    }

    public void printAll() {
        for (Object writedPersons : list) {
            System.out.println(writedPersons);
        }
    }

    public String searchNumber(String name) {
        for (Person person : list) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}

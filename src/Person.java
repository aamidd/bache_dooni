import java.util.ArrayList;

public class Person {
    private final String parent;
    private final String name;
    private final String lastName;
    private final ArrayList<Person> children = new ArrayList<>();
    public Person(String name, String lastName) {
        this.parent = "adam or eve or some shit idk";
        this.name = name;
        this.lastName = lastName;
    }
    public Person(String parent, String name, String lastName) {
        this.parent = parent;
        this.name = name;
        this.lastName = lastName;
    }
    public String getParent() {
        return parent;
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    public void addKid(Person child) {
        children.add(child);
    }

    public void print() {
        System.out.printf("%s %s, child of: %s%n", getName(), getLastName(), getParent());
        for (Person child : children) {
            child.print();
        }
    }
}

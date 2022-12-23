package az.ikt.java.lesson10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application {

    public static void run() {

        Person father = new Person("Adam", "Not defined");
        Person mother = new Person("Havva", "Not defined");

    }
    List<Person> people = new ArrayList<>(15);

    private void loadPeople() {
        people.add(new Person("PN1", "PSN1", 12, Gender.MALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN2", "PSN2", 122, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN3", "PSN3", 11, Gender.MALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN4", "PSN4", 45, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN5", "PSN5", 56, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN6", "PSN6", 78, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN7", "PSN7", 99, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN8", "PSN8", 22, Gender.MALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN9", "PSN9", 33, Gender.MALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN10", "PSN10", 111, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN11", "PSN11", 54, Gender.MALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN12", "PSN12", 55, Gender.MALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN13", "PSN13", 77, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN14", "PSN14", 98, Gender.MALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
        people.add(new Person("PN15", "PSN15", 100, Gender.FEMALE, new Person("Adam", "Adam"), new Person("Havva", "Havva")));
    }

}


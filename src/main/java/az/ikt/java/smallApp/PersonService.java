package az.ikt.java.smallApp;

public class PersonService {

    public void savePerson(Person person) {

        Application.personList.add(person);
    }

    public void showPeople() {

        Application.personList.forEach(System.out::println);
    }
}

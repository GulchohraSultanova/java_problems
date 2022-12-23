package az.ikt.java.smallApp;

public class UserService {

    public void registerUser(User user) {

        Application.personList.add(user);
    }
}

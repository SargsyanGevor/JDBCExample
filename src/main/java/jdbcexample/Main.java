package jdbcexample;

import jdbcexample.manager.UserManager;
import jdbcexample.model.User;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        UserManager userManager = new UserManager();

        try {
            userManager.addUser(new User("poxos", "poxosyan", "poxos@mail.ru", "poxosik"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

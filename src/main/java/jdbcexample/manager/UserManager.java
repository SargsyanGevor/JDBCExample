package jdbcexample.manager;

import jdbcexample.db.DBConnectionProvider;
import jdbcexample.model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class UserManager {

    private Connection connection;


    public UserManager() {

        connection = DBConnectionProvider.getInstance().getConnection();
    }

    public void addUser(User user) throws SQLException {

        Statement statement = connection.createStatement();
        String query = "Insert into user(name, surname,email, password) Values('"
                + user.getName() + "','" + user.getSurname() + "','" + user.getEmail()
                + "','" + user.getPassword() + "')";
        statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

    }

}


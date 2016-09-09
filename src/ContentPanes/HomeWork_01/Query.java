package ContentPanes.HomeWork_01;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 9/3/2016.
 * reminder to implement passwordbox
 */
class Query {
    private static Connection _connection=null;

    private static void openConnection() {
        try {
            _connection = DriverManager.getConnection("jdbc:mysql://turing.cs.missouriwestern.edu/misc?" + "user=csc285&password=age119");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static List<Person> getPeople() {
        ArrayList<Person> people = new ArrayList<>();
        openConnection();
        String query = "SELECT givenname,surname,city,zip FROM people WHERE zip LIKE '6450_' ORDER BY surname";
        try {
            Statement statement = _connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String givenname = resultSet.getString("givenname");
                String surname = resultSet.getString("surname");
                String city = resultSet.getString("city");
                int zip = resultSet.getInt("zip");
                people.add(new Person(givenname, surname, city, zip));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return people;

    }
}

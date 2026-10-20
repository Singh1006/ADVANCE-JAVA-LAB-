import java.sql.*;

public class JdbcDemo {

   static final String URL = "jdbc:mysql://localhost:3306/college";
static final String USER = "root";
static final String PASSWORD = System.getenv("MYSQL_PASSWORD");

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(
                URL, USER, PASSWORD)) {

            System.out.println("Connected to MySQL successfully!");

            // INSERT
            try (PreparedStatement insert = con.prepareStatement(
                    "INSERT INTO student VALUES (?, ?, ?)")) {

                insert.setInt(1, 103);
                insert.setString(2, "Neha");
                insert.setString(3, "ECE");

                insert.executeUpdate();

                System.out.println("Record Inserted");
            }

            // UPDATE
            try (PreparedStatement update = con.prepareStatement(
                    "UPDATE student SET branch = ? WHERE id = ?")) {

                update.setString(1, "CSE");
                update.setInt(2, 103);

                update.executeUpdate();

                System.out.println("Record Updated");
            }

            // SELECT
            try (Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery(
                         "SELECT * FROM student")) {

                System.out.println("\nStudent Records:");

                while (rs.next()) {
                    System.out.println(
                            rs.getInt("id") + " "
                            + rs.getString("name") + " "
                            + rs.getString("branch")
                    );
                }
            }

            // DELETE
            try (PreparedStatement delete = con.prepareStatement(
                    "DELETE FROM student WHERE id = ?")) {

                delete.setInt(1, 103);

                delete.executeUpdate();

                System.out.println("\nRecord Deleted");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

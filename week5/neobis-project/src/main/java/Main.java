import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection con = DataBaseCon.getConnection();

        //to add a row
        String add = "INSERT INTO cake (id, flavour, cream, layers, cost) VALUES (1, 'oreo', 'butter cream', 5, 250)";
        PreparedStatement ps = con.prepareStatement(add);
        ps.executeUpdate();

        //update info
        String update = "UPDATE cake SET flavour = 'Chocolate' WHERE id = 1";
        PreparedStatement up = con.prepareStatement(update);
        up.execute();

        //delete info
        String delete = "DELETE FROM cake WHERE id = 1";
        PreparedStatement delps = con.prepareStatement(delete);
        delps.execute();



    }

    public static class DataBaseCon {

        public static Connection getConnection() throws SQLException {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/neobis", "root", "Madachan2702");
            //if access returns, it will print "Connection success" in console
            System.out.println("Connection success");
            return connection;
        }
    }

}


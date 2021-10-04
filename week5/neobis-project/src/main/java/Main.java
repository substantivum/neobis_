import jdk.jfr.StackTrace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection con = DataBaseCon.getConnection();
        con.close();

        Add();
        Update();
        Delete();
    }

    public static void Add() {
        try {
            Connection con = DataBaseCon.getConnection();
            String add = "INSERT INTO cake (id, flavour, cream, layers, cost) VALUES (1, 'oreo', 'butter cream', 5, 250)";
            PreparedStatement ps = con.prepareStatement(add);
            ps.executeUpdate();
            ps.close();
            con.close();
            System.out.println("Information successfully added");
        } catch (SQLException throwables) {
            System.out.println("Information has not been added");
            throwables.printStackTrace();
        }

    }

    public static void Update() {

        Connection con = null;
        try {
            con = DataBaseCon.getConnection();
            String update = "UPDATE cake SET flavour = 'Chocolate' WHERE id = 1";
            PreparedStatement up = con.prepareStatement(update);
            up.execute();
            up.close();
            con.close();
            System.out.println("Information was successfully updated");
        } catch (SQLException throwables) {
            System.out.println("Information was not updated");
            throwables.printStackTrace();
        }
    }

    public static void Delete() {
        try {
            Connection con = DataBaseCon.getConnection();
            String delete = "DELETE FROM cake WHERE id = 1";
            PreparedStatement delps = con.prepareStatement(delete);
            delps.execute();
            delps.close();
            con.close();
            System.out.println("Information was successfully deleted");

        } catch (SQLException throwables) {
            System.out.println("Information was not deleted");
            throwables.printStackTrace();
        }

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



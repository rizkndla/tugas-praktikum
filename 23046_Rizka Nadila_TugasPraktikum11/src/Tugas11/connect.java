package Tugas11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author rizkndla
 */
public class connect {
    
    private static Connection cnc;

    public static Connection cnc() throws SQLException, ClassNotFoundException {
        try {
            if (cnc == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                cnc = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3d", "root", "");
                System.out.println("Koneksi berhasil!");
            }
            return cnc;
        } catch (SQLException e) {
            System.err.println("Error: Koneksi tidak berhasil! " + e.getMessage());
            throw e;
        }
    }
}
package Tugas11;

/**
 *
 * @author rizkndla
 */



import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author dzikr
 */
public class testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan username: ");
        String uname = input.nextLine();
        System.out.print("Masukkan password: ");
        String passwd = input.next();
        try {
            Connection connection = connect.cnc();
            System.out.println("Koneksi berhasil!");

            Statement statement = connection.createStatement();

            // Contoh query SELECT
            String query = "SELECT * FROM users WHERE Username = '" + uname + "' AND Password = '" + passwd+"'";
            System.out.println(query);
            ResultSet resultSet = statement.executeQuery(query);

            
            if(resultSet.next()){
                System.out.println("Login berhasil");
            }else{
                System.out.println("Username atau password salah");
            }
            
            
            resultSet.close();
            statement.close();
            connection.close();
            
            
//            String sql = "SELECT * FROM petugas WHERE username = ? AND password = ?";

//            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//                preparedStatement.setString(1, username);
//                preparedStatement.setString(2, password);
//
//                try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                    if (resultSet.next()) {
            

            // Menutup koneksi dan statement
            

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
   
        
    }

}
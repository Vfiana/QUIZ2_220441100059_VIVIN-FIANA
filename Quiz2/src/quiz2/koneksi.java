
package quiz2;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class koneksi {
    private static Connection mysqlkonek;
    public static Connection koneksiDB() throws SQLException {
        try {
            String db = "jdbc:mysql://localhost:3306/quiz2";
            String user = "root";
            String pw = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlkonek = (Connection) DriverManager.getConnection(db, user, pw);
//            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal: " + e.getMessage());
        }
        return mysqlkonek;
    }
    
    public static void main(String[] args) {
        try{
            java.sql.Connection conn = koneksiDB();
            if (conn != null){
                System.out.println("Koneksi Berhasil");
            }else{
                System.out.println("Koneksi Gagal");
            }
        }catch (Exception e){
            System.out.println("Terjadi Kesalahan : " + e.getMessage());
        }
    }
}

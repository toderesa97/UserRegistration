
package userapplication;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Toderesa97
 */
public class Conexion {

    private static Connection cnx = null;

    public static Connection getConnection(){
        if (cnx == null) {
            try {
                cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/ODS_DB", 
                        "root", "");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Unable to connect with database");
            }
        }
        return cnx;
    }

    public static void closeConnection() throws SQLException {
        if (cnx != null) {
            cnx.close();
        }
    }

}
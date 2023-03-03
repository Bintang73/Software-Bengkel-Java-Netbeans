package fungsi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import koneksi.myconnection;

public class myfungsi {
    static Connection Cnn;
    static Statement st;
    static myconnection db = new myconnection();
    static int i;

   public static int EQuery(String sql) throws SQLException {
        i = 0;
        try {
            Cnn = (Connection) db.getConnection();
            st = Cnn.createStatement();
            i = st.executeUpdate(sql);
            return i;
        } catch (ClassNotFoundException | SQLException e) {
            return i;
        } finally {
            Cnn.close();
        }
    }
}

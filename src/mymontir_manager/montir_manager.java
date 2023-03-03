
package mymontir_manager;
import java.sql.SQLException;
import montir.mymontir;
import fungsi.myfungsi;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.myconnection;

public class montir_manager {
    int i;
    static myconnection kon = new myconnection();

    /*public int inputData(mymontir mont) {
        i = 0;
        try {
            String sql = "insert into montir (nama_montir, alamat, no_telp, email) "
                    + " values ('" + mont.getNama() + "','" + mont.getAlamat()
                    + "','" + mont.getTelp() + "','" + mont.getEmail() + "','" + "' )";
            
            i = myfungsi.EQuery(sql);
            return i;
            
        } catch (SQLException e) {
            return i;
        }
    }*/
    
    public boolean inputData(mymontir mont) throws ClassNotFoundException {
        boolean masuk = false;
        Statement state = kon.getConnection();
        try {
            String query = "insert into montir (nama_montir, alamat, no_telp, email) "
                    + " values ('" + mont.getNama() + "','" + mont.getAlamat()
                    + "','" + mont.getTelp() + "','" + mont.getEmail() + "' )";
            int rs = state.executeUpdate(query);
            if (rs == 1) {
                masuk = true;
            } else {
                masuk = false;
            }
            return masuk;
        } catch (SQLException e) {
            System.out.println(e);
            return masuk;
        }
    }
    
    public boolean updateData(mymontir mont, int ID) throws ClassNotFoundException {
        boolean masuk = false;
        Statement state = kon.getConnection();
        try {
            String query = "UPDATE montir SET nama_montir = " + "'" + mont.getNama() + "',"
                    + " alamat = " + "'" + mont.getAlamat() + "',"
                    + " no_telp = " + "'" + mont.getTelp() + "',"
                    + " email = " + "'" + mont.getEmail() + "' "
                    + "WHERE kd_montir = '"+ID+"'";
            int rs = state.executeUpdate(query);
            if (rs == 1) {
                masuk = true;
            } else {
                masuk = false;
            }
            return masuk;
        } catch (SQLException e) {
            System.out.println(e);
            return masuk;
        }
    }
    
    
    public boolean hapusData(int ID) throws ClassNotFoundException {
        boolean masuk = false;
        Statement state = kon.getConnection();
        try {
            String query = "delete from montir where kd_montir='"+ID+"'";
            int rs = state.executeUpdate(query);
            if (rs == 1) {
                masuk = true;
            } else {
                masuk = false;
            }
            return masuk;
        } catch (SQLException e) {
            System.out.println(e);
            return masuk;
        }
    }
    
    public int updateData(mymontir mont) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
  }




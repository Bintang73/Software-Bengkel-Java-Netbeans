package mybarang_manager;

import fungsi.myfungsi;
import java.sql.SQLException;
import barang.mybarang;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.myconnection;
import menu.dashboard;

public class barang_manager {

    int i;
    static myconnection kon = new myconnection();

    /*public int inputData(mybarang bar) {
        i = 0;
        try {
            String sql = "insert into montir (kd_barang, nama_barang, harga, stok "
                    + " values ('" + bar.getKode() + "','" + bar.getNama()
                    + "','" + bar.getHarga() + "','" + bar.getStok() + "')";

            i = myfungsi.EQuery(sql);
            return i;

        } catch (SQLException e) {
            return i;
        }
    }*/
    
    public boolean inputData(mybarang bar) throws ClassNotFoundException {
        boolean masuk = false;
        Statement state = kon.getConnection();
        try {
            String query = "insert into barang_jasa (nama_barang, harga, stok) "
                    + " values ('" + bar.getNama() + "','" + bar.getHarga()
                    + "','" + bar.getStok() + "' )";
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
    
    public boolean updateData(mybarang mont, int ID) throws ClassNotFoundException {
        boolean masuk = false;
        Statement state = kon.getConnection();
        try {
            String query = "UPDATE barang_jasa SET nama_barang = " + "'" + mont.getNama() + "',"
                    + " harga = " + "'" + mont.getHarga() + "',"
                    + " stok = " + "'" + mont.getStok() + "' "
                    + "WHERE kd_barang = '"+ID+"'";
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
            String query = "delete from barang_jasa where kd_barang='"+ID+"'";
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

    public int updateData(mybarang bar) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

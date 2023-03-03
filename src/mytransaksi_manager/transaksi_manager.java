
package mytransaksi_manager;

import barang.mybarang;
import java.sql.SQLException;
import java.sql.Statement;
import koneksi.myconnection;
import transaksi.mytransaksi;


public class transaksi_manager {
    int i;
    static myconnection kon = new myconnection();
    
    public boolean inputData(mytransaksi trn) throws ClassNotFoundException {
        boolean masuk = false;
        Statement state = kon.getConnection();
        try {
            String query = "insert into transaksi (kd_barang, nama_barang, nama_pembeli, harga, jumlah, total_bayar, uang_pembeli, kembalian, id, tanggal, kd_montir, nama_montir) "
                    + " values ('" + trn.getKodeBarang() 
                    + "','" + trn.getNamaBarang()
                    + "','" + trn.getNamaPembeli()
                    + "','" + trn.getHarga()
                    + "','" + trn.getJumlah()
                    + "','" + trn.getTotal()
                    + "','" + trn.getUang()
                    + "','" + trn.getKembalian()
                    + "','" + trn.getId()
                    + "','" + trn.getTanggal()
                    + "','" + trn.getKodeMontir()
                    + "','" + trn.getNamaMontir() + "' )";
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
    
    public boolean updateData(mytransaksi trn, int ID) throws ClassNotFoundException {
        boolean masuk = false;
        Statement state = kon.getConnection();
        try {
            String query = "UPDATE transaksi SET kd_barang = " + "'" + trn.getKodeBarang() + "',"
                    + " nama_barang = " + "'" + trn.getNamaBarang() + "',"
                    + " nama_pembeli = " + "'" + trn.getNamaPembeli() + "',"
                    + " harga = " + "'" + trn.getHarga() + "',"
                    + " jumlah = " + "'" + trn.getJumlah() + "',"
                    + " total_bayar = " + "'" + trn.getTotal() + "',"
                    + " uang_pembeli = " + "'" + trn.getUang() + "',"
                    + " kembalian = " + "'" + trn.getKembalian() + "',"
                    + " id = " + "'" + trn.getId() + "',"
                    + " tanggal = " + "'" + trn.getTanggal() + "',"
                    + " kd_montir = " + "'" + trn.getKodeMontir() + "',"
                    + " nama_montir = " + "'" + trn.getNamaMontir() + "'"
                    + " WHERE kd_transaksi = '"+ID+"'";
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
            String query = "delete from transaksi where kd_transaksi='"+ID+"'";
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

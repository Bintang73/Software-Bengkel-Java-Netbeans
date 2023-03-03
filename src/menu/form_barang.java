/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import barang.mybarang;
import fungsi.JTableBarang;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import koneksi.myconnection;
import mybarang_manager.barang_manager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class form_barang extends javax.swing.JFrame {

    static myconnection kon = new myconnection();
    private String Username;
    private int IDku;
    
    public form_barang(String username, int IDku) {
        this.Username = username;
        this.IDku = IDku;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        tbl_barang.setModel(sTable);
        tampilTabelBarang();
    }

    private void bersih() {
        txt_kodebarang.setText("");
        txt_namabarang.setText("");
        txt_harga.setText("");
        txt_stok.setText("");
        
    }

    JTableBarang sTable = new JTableBarang();

    private void tampilTabelBarang() {

        try {

            try {
                Statement state = null;
                state = kon.getConnection();
                int row = tbl_barang.getRowCount();
                for (int i = 0; i < row; i++) {
                    sTable.removeRow(0, row);
                }

                ResultSet rs = state.executeQuery("select * from barang_jasa");
                while (rs.next()) {
                    mybarang bar = new mybarang();
                    bar.setKode(rs.getInt("kd_barang"));
                    bar.setNama(rs.getString("nama_barang"));
                    bar.setHarga(rs.getInt("harga"));
                    bar.setStok(rs.getInt("stok"));
                    sTable.add(bar);
                }
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_simpan = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        txt_kodebarang = new javax.swing.JTextField();
        txt_namabarang = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_caribarang = new javax.swing.JTextField();
        txt_stok = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_barang = new javax.swing.JTable();
        btn_reset = new javax.swing.JButton();
        btn_montir = new javax.swing.JButton();
        btn_transaksi = new javax.swing.JButton();
        btn_nota = new javax.swing.JButton();
        btn_settings = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();
        btn_dashboard = new javax.swing.JButton();
        btn_cetak = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 130, 60));
        btn_simpan.setOpaque(false);
        btn_simpan.setContentAreaFilled(false);
        btn_simpan.setBorderPainted(false);

        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 130, 50));
        btn_hapus.setOpaque(false);
        btn_hapus.setContentAreaFilled(false);
        btn_hapus.setBorderPainted(false);

        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 130, 60));
        btn_ubah.setOpaque(false);
        btn_ubah.setContentAreaFilled(false);
        btn_ubah.setBorderPainted(false);

        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 603, 130, 50));
        btn_keluar.setOpaque(false);
        btn_keluar.setContentAreaFilled(false);
        btn_keluar.setBorderPainted(false);

        txt_kodebarang.setBorder(null);
        txt_kodebarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodebarangActionPerformed(evt);
            }
        });
        getContentPane().add(txt_kodebarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 280, 30));
        txt_kodebarang.setEditable(false);

        txt_namabarang.setBorder(null);
        txt_namabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namabarangActionPerformed(evt);
            }
        });
        getContentPane().add(txt_namabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 280, 40));

        txt_harga.setBorder(null);
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 280, 30));

        txt_caribarang.setBorder(null);
        txt_caribarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_caribarangActionPerformed(evt);
            }
        });
        getContentPane().add(txt_caribarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 300, 30));

        txt_stok.setBorder(null);
        txt_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stokActionPerformed(evt);
            }
        });
        getContentPane().add(txt_stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 280, 30));

        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 130, 50));
        btn_cari.setOpaque(false);
        btn_cari.setContentAreaFilled(false);
        btn_cari.setBorderPainted(false);

        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_barang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 480, 560));

        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 130, 50));
        btn_reset.setOpaque(false);
        btn_reset.setContentAreaFilled(false);
        btn_reset.setBorderPainted(false);

        btn_montir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_montirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_montir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 100, 40));
        btn_montir.setOpaque(false);
        btn_montir.setContentAreaFilled(false);
        btn_montir.setBorderPainted(false);

        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 100, 40));
        btn_transaksi.setOpaque(false);
        btn_transaksi.setContentAreaFilled(false);
        btn_transaksi.setBorderPainted(false);

        btn_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_notaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 100, 40));
        btn_nota.setOpaque(false);
        btn_nota.setContentAreaFilled(false);
        btn_nota.setBorderPainted(false);

        btn_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_settingsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 100, 40));
        btn_settings.setOpaque(false);
        btn_settings.setContentAreaFilled(false);
        btn_settings.setBorderPainted(false);

        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 100, 40));
        btn_about.setOpaque(false);
        btn_about.setContentAreaFilled(false);
        btn_about.setBorderPainted(false);

        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 100, 40));
        btn_dashboard.setOpaque(false);
        btn_dashboard.setContentAreaFilled(false);
        btn_dashboard.setBorderPainted(false);

        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 510, 130, 50));
        btn_cetak.setOpaque(false);
        btn_cetak.setContentAreaFilled(false);
        btn_cetak.setBorderPainted(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_barang.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1260, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed

        /*if (txt_namabarang.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nama harus diisi");
            txt_namabarang.requestFocus();
        } else if (txt_harga.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harga harus diisi");
            txt_harga.requestFocus();
        } else if (txt_stok.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Stok harus diisi");
            txt_stok.requestFocus();
        } else {
            int harga = Integer.parseInt(txt_harga.getText());
            int stok = Integer.parseInt(txt_stok.getText());
            mybarang bar = new mybarang(txt_namabarang.getText(), harga, stok);
            barang_manager barm = new barang_manager();
            int i = barm.inputData(bar);
            if (i == 1) {
                JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
                bersih();
                txt_namabarang.requestFocus();
                tampilTabelBarang();
            } else {
                JOptionPane.showMessageDialog(null, "Data gagal Disimpan");
                txt_namabarang.requestFocus();
            }
        }*/
        if (txt_kodebarang.getText().equals("aaaa")) {
            JOptionPane.showMessageDialog(null, "Kode barang harus diisi");
            txt_kodebarang.requestFocus();
        } else if (txt_namabarang.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nama barang harus diisi");
            txt_namabarang.requestFocus();
        } else if (txt_harga.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Alamat harus diisi");
            txt_harga.requestFocus();
        } else if (txt_stok.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No Telepon harus diisi");
            txt_stok.requestFocus();
        } else {
            int harga = Integer.parseInt(txt_harga.getText());
            int stok = Integer.parseInt(txt_stok.getText());
            mybarang bar = new mybarang(txt_namabarang.getText(), harga, stok);
            barang_manager barm = new barang_manager();

            try {
                if (barm.inputData(bar) == true) {
                    JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
                    bersih();
                    txt_kodebarang.requestFocus();
                    tampilTabelBarang();
                } else {
                    JOptionPane.showMessageDialog(null, "Data gagal Disimpan");
                    txt_kodebarang.requestFocus();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(form_barang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed

        /*if (txt_kodebarang.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus!");
        } else {
            int jawab = JOptionPane.showConfirmDialog(rootPane, "Hapus Barang" + txt_kodebarang.getText() + "?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            
            if (jawab == JOptionPane.YES_OPTION) {
                barang_manager bm = new barang_manager();
                try {
                    if (bm.hapusData(Integer.parseInt(txt_kodebarang.getText())) == true) {
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                        bersih();
                        txt_kodebarang.requestFocus();
                        tampilTabelBarang();
                    } else {
                        JOptionPane.showMessageDialog(this, "Data gagal dihapus");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(form_barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }*/
        if (tbl_barang.getSelectedRow() != -1) {
            String idbarang = tbl_barang.getModel().getValueAt(tbl_barang.getSelectedRow(), 0).toString();
            String nama_barang = tbl_barang.getModel().getValueAt(tbl_barang.getSelectedRow(), 1).toString();
            int jawab = JOptionPane.showConfirmDialog(rootPane, "Hapus barang " + nama_barang + " ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (jawab == JOptionPane.YES_OPTION) {
                barang_manager mm = new barang_manager();
                try {
                    if (mm.hapusData(Integer.parseInt(idbarang)) == true) {
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                        bersih();
                        txt_kodebarang.requestFocus();
                        tampilTabelBarang();
                    } else {
                        JOptionPane.showMessageDialog(this, "Data gagal dihapus");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(form_barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus!");
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void txt_namabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namabarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namabarangActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void txt_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stokActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        /*if (txt_namabarang.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nama barang harus diisi");
            txt_namabarang.requestFocus();
        } else if (txt_harga.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Harga harus diisi");
            txt_harga.requestFocus();
        } else if (txt_stok.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Stok harus diisi");
            txt_stok.requestFocus();
        } else {
            int harga = Integer.parseInt(txt_harga.getText());
            int stok = Integer.parseInt(txt_stok.getText());
            mybarang bar = new mybarang(txt_namabarang.getText(), harga, stok);
            barang_manager barm = new barang_manager();
            int i = barm.updateData(bar);
            if (i == 1) {
                JOptionPane.showMessageDialog(null, "Update Data Berhasil");
                bersih();
                txt_namabarang.requestFocus();
                tampilTabelBarang();
            } else {
                JOptionPane.showMessageDialog(null, "Data gagal Diupdate");
                txt_namabarang.requestFocus();
            }
        }*/

        if (tbl_barang.getSelectedRow() != -1) {
            int idbarang = (int) tbl_barang.getModel().getValueAt(tbl_barang.getSelectedRow(), 0);
            String nama_barang = tbl_barang.getModel().getValueAt(tbl_barang.getSelectedRow(), 1).toString();
            String harga = tbl_barang.getModel().getValueAt(tbl_barang.getSelectedRow(), 2).toString();
            String stok = tbl_barang.getModel().getValueAt(tbl_barang.getSelectedRow(), 3).toString();

            String in_namabarang = !txt_namabarang.getText().equals("") ? txt_namabarang.getText() : nama_barang;
            String in_harga = !txt_harga.getText().equals("") ? txt_harga.getText() : harga;
            String in_stok = !txt_stok.getText().equals("") ? txt_stok.getText() : stok;

            if (!txt_namabarang.getText().equals("") || !txt_harga.getText().equals("") || !txt_stok.getText().equals("")) {
                int hargas = Integer.parseInt(in_harga);
                int stoks = Integer.parseInt(in_stok);
                mybarang bar = new mybarang(in_namabarang, hargas, stoks);
                barang_manager barm = new barang_manager();

                try {
                    if (barm.updateData(bar, idbarang) == true) {
                        JOptionPane.showMessageDialog(null, "Update Data Berhasil");
                        bersih();
                        txt_kodebarang.requestFocus();
                        tampilTabelBarang();
                    } else {
                        JOptionPane.showMessageDialog(null, "Data gagal Diupdate");
                        txt_kodebarang.requestFocus();
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(form_barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pilih salah satu data!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan diubah!");
        }
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        bersih();
            tampilTabelBarang();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void txt_kodebarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodebarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodebarangActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        
    }//GEN-LAST:event_btn_cariActionPerformed

    private void txt_caribarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_caribarangActionPerformed
        
        try {
            if (txt_caribarang.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Pilih data yang akan dicari!");
            } else {
                Statement state = null;
                state = kon.getConnection();
                int row = tbl_barang.getRowCount();
                for (int i = 0; i < row; i++) {
                    sTable.removeRow(0, row);
                }
                ResultSet rs = state.executeQuery("select * from barang_jasa where nama_barang like '%" + txt_caribarang.getText() + "%' order by kd_barang asc");
                while (rs.next()) {
                    mybarang bar = new mybarang();
                    bar.setKode(rs.getInt("kd_barang"));
                    bar.setNama(rs.getString("nama_barang"));
                    bar.setHarga(rs.getInt("harga"));
                    bar.setStok(rs.getInt("stok"));
                    sTable.add(bar);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(form_barang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(form_barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_caribarangActionPerformed

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        try {
            dispose();
            new dashboard(Username, IDku).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(form_barang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_montirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_montirActionPerformed
       try {
           dispose(); 
           new form_montir(Username, IDku).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_montirActionPerformed

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
       String url = "jdbc:mysql://localhost:3306/db_bengkelbaru"; 
       File reportFile = new File(".");
       String dirr = "";
       String jdbcDriver = "com.mysql.jdbc.Driver";
       String user = "root";
       String pass = "";
       
        JasperReport reports;
        
        File file = new File("src/Report/Barang.jasper");
        String path = file.getAbsolutePath();
        try {
            Class.forName(jdbcDriver);
            com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, user, pass);
            Statement stat = conn.createStatement();
            reports = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(path, null, conn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(form_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(form_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(form_transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_cetakActionPerformed

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        dispose();
        new form_transaksi(Username, IDku).setVisible(true);
    }//GEN-LAST:event_btn_transaksiActionPerformed

    private void btn_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notaActionPerformed
        dispose();
        new form_nota(Username, IDku).setVisible(true);
    }//GEN-LAST:event_btn_notaActionPerformed

    private void btn_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_settingsActionPerformed
        dispose();
        new form_settings(Username, IDku).setVisible(true);
    }//GEN-LAST:event_btn_settingsActionPerformed

    private void btn_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutActionPerformed
        dispose();
        new form_about(Username, IDku).setVisible(true);
    }//GEN-LAST:event_btn_aboutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (InstantiationException ex) {
            System.out.println(ex);
        } catch (IllegalAccessException ex) {
            System.out.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println(ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_montir;
    private javax.swing.JButton btn_nota;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_settings;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_barang;
    private javax.swing.JTextField txt_caribarang;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_kodebarang;
    private javax.swing.JTextField txt_namabarang;
    private javax.swing.JTextField txt_stok;
    // End of variables declaration//GEN-END:variables
}
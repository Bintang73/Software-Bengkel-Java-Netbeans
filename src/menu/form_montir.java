package menu;

import montir.mymontir;
import fungsi.JTableMontir;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import koneksi.myconnection;
import static menu.form_barang.kon;
import mymontir_manager.montir_manager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class form_montir extends javax.swing.JFrame {

    static myconnection kon = new myconnection();

    private String Username;
    private int IDku;

    public form_montir(String username, int IDku) throws ClassNotFoundException {
        this.Username = username;
        this.IDku = IDku;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        tbl_montir.setModel(mTable);
        tampilTabelMontir();
    }

    private void bersih() {
        txt_kodemontir.setText("");
        txt_namamontir.setText("");
        txt_alamat.setText("");
        txt_notelp.setText("");
        txt_email.setText("");
        txt_carimontir.setText("");
    }

    JTableMontir mTable = new JTableMontir();

    private void tampilTabelMontir() throws ClassNotFoundException {

        try {

            Statement state = null;
            state = kon.getConnection();
            int row = tbl_montir.getRowCount();
            for (int i = 0; i < row; i++) {
                mTable.removeRow(0, row);
            }
            ResultSet rs = state.executeQuery("select * from montir");
            while (rs.next()) {
                mymontir mon = new mymontir();
                mon.setKode(rs.getInt("kd_montir"));
                mon.setNama(rs.getString("nama_montir"));
                mon.setAlamat(rs.getString("alamat"));
                mon.setEmail(rs.getString("email"));
                mon.setTelp(rs.getString("no_telp"));
                mTable.add(mon);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_namamontir = new javax.swing.JTextField();
        txt_carimontir = new javax.swing.JTextField();
        txt_kodemontir = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();
        btn_hapus = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        txt_notelp = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_montir = new javax.swing.JTable();
        txt_email = new javax.swing.JTextField();
        btn_dashboard = new javax.swing.JButton();
        btn_barang = new javax.swing.JButton();
        btn_transaksi = new javax.swing.JButton();
        btn_nota = new javax.swing.JButton();
        btn_settings = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();
        btn_cetak = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jButton5.setText("jButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_namamontir.setBorder(null);
        txt_namamontir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namamontirActionPerformed(evt);
            }
        });
        getContentPane().add(txt_namamontir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 270, 30));

        txt_carimontir.setBorder(null);
        txt_carimontir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_carimontirActionPerformed(evt);
            }
        });
        getContentPane().add(txt_carimontir, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 310, 40));
        txt_carimontir.setOpaque(false);

        txt_kodemontir.setBorder(null);
        txt_kodemontir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodemontirActionPerformed(evt);
            }
        });
        getContentPane().add(txt_kodemontir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 270, 30));
        txt_kodemontir.setEditable(false);

        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 130, 50));
        btn_tambah.setOpaque(false);
        btn_tambah.setContentAreaFilled(false);
        btn_tambah.setBorderPainted(false);

        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 140, 50));
        btn_simpan.setOpaque(false);
        btn_simpan.setContentAreaFilled(false);
        btn_simpan.setBorderPainted(false);

        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 140, 50));
        btn_reset.setOpaque(false);
        btn_reset.setContentAreaFilled(false);
        btn_reset.setBorderPainted(false);

        jScrollPane1.setBorder(null);

        txt_alamat.setColumns(20);
        txt_alamat.setRows(5);
        jScrollPane1.setViewportView(txt_alamat);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 270, 40));

        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 130, 50));
        btn_hapus.setOpaque(false);
        btn_hapus.setContentAreaFilled(false);
        btn_hapus.setBorderPainted(false);

        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 130, 50));
        btn_keluar.setOpaque(false);
        btn_keluar.setContentAreaFilled(false);
        btn_keluar.setBorderPainted(false);

        txt_notelp.setBorder(null);
        txt_notelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_notelpActionPerformed(evt);
            }
        });
        getContentPane().add(txt_notelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 270, 30));

        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, 140, 50));
        btn_cari.setOpaque(false);
        btn_cari.setContentAreaFilled(false);
        btn_cari.setBorderPainted(false);

        tbl_montir.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tbl_montir);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 530, 600));

        txt_email.setBorder(null);
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 270, 30));

        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 100, 40));
        btn_dashboard.setOpaque(false);
        btn_dashboard.setContentAreaFilled(false);
        btn_dashboard.setBorderPainted(false);

        btn_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_barangActionPerformed(evt);
            }
        });
        getContentPane().add(btn_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 100, 40));
        btn_barang.setOpaque(false);
        btn_barang.setContentAreaFilled(false);
        btn_barang.setBorderPainted(false);

        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 100, 40));
        btn_transaksi.setOpaque(false);
        btn_transaksi.setContentAreaFilled(false);
        btn_transaksi.setBorderPainted(false);

        btn_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_notaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 100, 40));
        btn_nota.setOpaque(false);
        btn_nota.setContentAreaFilled(false);
        btn_nota.setBorderPainted(false);

        btn_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_settingsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 100, 40));
        btn_settings.setOpaque(false);
        btn_settings.setContentAreaFilled(false);
        btn_settings.setBorderPainted(false);

        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 100, 40));
        btn_about.setOpaque(false);
        btn_about.setContentAreaFilled(false);
        btn_about.setBorderPainted(false);

        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 120, 50));
        btn_cetak.setOpaque(false);
        btn_cetak.setContentAreaFilled(false);
        btn_cetak.setBorderPainted(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_montir.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1270, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_carimontirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_carimontirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_carimontirActionPerformed

    private void txt_kodemontirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodemontirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodemontirActionPerformed

    private void txt_notelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_notelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_notelpActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        if (txt_kodemontir.getText().equals("aaaa")) {
            JOptionPane.showMessageDialog(null, "Kode Montir harus diisi");
            txt_kodemontir.requestFocus();
        } else if (txt_namamontir.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Nama Montir harus diisi");
            txt_namamontir.requestFocus();
        } else if (txt_alamat.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Alamat harus diisi");
            txt_alamat.requestFocus();
        } else if (txt_notelp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No Telepon harus diisi");
            txt_notelp.requestFocus();
        } else if (txt_email.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Email harus diisi");
            txt_email.requestFocus();
        } else {
            //int kd_montir = Integer.parseInt(txt_kodemontir.getText());
            mymontir mont = new mymontir(txt_namamontir.getText(), txt_alamat.getText(), txt_notelp.getText(), txt_email.getText());
            montir_manager monm = new montir_manager();

            try {
                if (monm.inputData(mont) == true) {
                    try {
                        JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
                        bersih();
                        txt_kodemontir.requestFocus();
                        tampilTabelMontir();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(form_montir.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Data gagal Disimpan");
                    txt_kodemontir.requestFocus();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(form_montir.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        if (tbl_montir.getSelectedRow() != -1) {
            int idmontir = (int) tbl_montir.getModel().getValueAt(tbl_montir.getSelectedRow(), 0);
            String nama_montir = tbl_montir.getModel().getValueAt(tbl_montir.getSelectedRow(), 1).toString();
            String alamat = tbl_montir.getModel().getValueAt(tbl_montir.getSelectedRow(), 2).toString();
            String no_telp = tbl_montir.getModel().getValueAt(tbl_montir.getSelectedRow(), 3).toString();
            String email = tbl_montir.getModel().getValueAt(tbl_montir.getSelectedRow(), 4).toString();

            System.out.println(email);

            String in_namamontir = !txt_namamontir.getText().equals("") ? txt_namamontir.getText() : nama_montir;
            String in_alamat = !txt_alamat.getText().equals("") ? txt_alamat.getText() : alamat;
            String in_notelp = !txt_notelp.getText().equals("") ? txt_notelp.getText() : no_telp;
            String in_email = !txt_email.getText().equals("") ? txt_email.getText() : email;

            if (!txt_namamontir.getText().equals("") || !txt_alamat.getText().equals("") || !txt_notelp.getText().equals("") || !txt_email.getText().equals("")) {
                mymontir mont = new mymontir(in_namamontir, in_alamat, in_notelp, in_email);
                montir_manager monm = new montir_manager();

                try {
                    if (monm.updateData(mont, idmontir) == true) {
                        try {
                            JOptionPane.showMessageDialog(null, "Update Data Berhasil");
                            bersih();
                            txt_kodemontir.requestFocus();
                            tampilTabelMontir();
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(form_montir.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Data gagal Diupdate");
                        txt_kodemontir.requestFocus();
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(form_montir.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pilih salah satu data!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan diubah!");
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        /*if (txt_kodemontir.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus!");
        } else {
            int jawab = JOptionPane.showConfirmDialog(rootPane, "Hapus Barang" + txt_kodemontir.getText() + "?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (jawab == JOptionPane.YES_OPTION) {
                montir_manager mm = new montir_manager();
                try {
                    if (mm.hapusData(Integer.parseInt(txt_kodemontir.getText())) == true) {
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                        bersih();
                        txt_kodemontir.requestFocus();
                        tampilTabelMontir();
                    } else {
                        JOptionPane.showMessageDialog(this, "Data gagal dihapus");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(form_barang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }*/

        if (tbl_montir.getSelectedRow() != -1) {
            String idmontir = tbl_montir.getModel().getValueAt(tbl_montir.getSelectedRow(), 0).toString();
            String nama_montir = tbl_montir.getModel().getValueAt(tbl_montir.getSelectedRow(), 1).toString();
            int jawab = JOptionPane.showConfirmDialog(rootPane, "Hapus Montir " + nama_montir + " ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (jawab == JOptionPane.YES_OPTION) {
                montir_manager mm = new montir_manager();
                try {
                    if (mm.hapusData(Integer.parseInt(idmontir)) == true) {
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                        bersih();
                        txt_kodemontir.requestFocus();
                        tampilTabelMontir();
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

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        bersih();
        try {
            tampilTabelMontir();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(form_montir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed

        try {
            if (txt_carimontir.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Pilih data yang akan dicari!");
            } else {
                Statement state = null;
                state = kon.getConnection();
                int row = tbl_montir.getRowCount();
                for (int i = 0; i < row; i++) {
                    mTable.removeRow(0, row);
                }
                ResultSet rs = state.executeQuery("select * from montir where nama_montir like '%" + txt_carimontir.getText() + "%' order by kd_montir asc");
                while (rs.next()) {
                    mymontir mon = new mymontir();
                    mon.setKode(rs.getInt("kd_montir"));
                    mon.setNama(rs.getString("nama_montir"));
                    mon.setAlamat(rs.getString("alamat"));
                    mon.setEmail(rs.getString("email"));
                    mon.setTelp(rs.getString("no_telp"));
                    mTable.add(mon);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(form_montir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(form_montir.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_cariActionPerformed

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        dispose();
        new form_transaksi(Username, IDku).setVisible(true);
    }//GEN-LAST:event_btn_transaksiActionPerformed

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        try {
            dispose();
            new dashboard(Username, IDku).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(form_montir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void txt_namamontirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namamontirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namamontirActionPerformed

    private void btn_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notaActionPerformed
        dispose();
        new form_nota(Username, IDku).setVisible(true);
    }//GEN-LAST:event_btn_notaActionPerformed

    private void btn_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_barangActionPerformed
        dispose();
        new form_barang(Username, IDku).setVisible(true);
    }//GEN-LAST:event_btn_barangActionPerformed

    private void btn_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_settingsActionPerformed
        dispose();
        new form_settings(Username, IDku).setVisible(true);
    }//GEN-LAST:event_btn_settingsActionPerformed

    private void btn_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutActionPerformed
        dispose();
        new form_about(Username, IDku).setVisible(true);
    }//GEN-LAST:event_btn_aboutActionPerformed

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
        String url = "jdbc:mysql://localhost:3306/db_bengkelbaru";
        File reportFile = new File(".");
        String dirr = "";
        String jdbcDriver = "com.mysql.jdbc.Driver";
        String user = "root";
        String pass = "";

        JasperReport reports;

        File file = new File("src/Report/Montir.jasper");
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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_barang;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_nota;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_settings;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbl_montir;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_carimontir;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_kodemontir;
    private javax.swing.JTextField txt_namamontir;
    private javax.swing.JTextField txt_notelp;
    // End of variables declaration//GEN-END:variables
}

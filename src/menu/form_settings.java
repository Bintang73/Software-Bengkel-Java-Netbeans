package menu;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static menu.form_login.kon;

public class form_settings extends javax.swing.JFrame {

    private String Username;
    private int IDku;

    public form_settings(String username, int IDku) {
        this.Username = username;
        this.IDku = IDku;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.Username = "robit";
    }

    private void bersih() {
        txt_passwordSebelumnya.setText("");
        txt_passwordBaru.setText("");
        txt_ulangiPassword.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_dashboard = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        btn_barang = new javax.swing.JButton();
        btn_montir = new javax.swing.JButton();
        btn_nota = new javax.swing.JButton();
        btn_about = new javax.swing.JButton();
        txt_passwordBaru = new javax.swing.JTextField();
        txt_ulangiPassword = new javax.swing.JTextField();
        btn_transaksi = new javax.swing.JButton();
        txt_passwordSebelumnya = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 90, 40));
        btn_dashboard.setOpaque(false);
        btn_dashboard.setContentAreaFilled(false);
        btn_dashboard.setBorderPainted(false);

        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 130, 40));
        btn_ubah.setOpaque(false);
        btn_ubah.setContentAreaFilled(false);
        btn_ubah.setBorderPainted(false);

        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 130, 40));
        btn_reset.setOpaque(false);
        btn_reset.setContentAreaFilled(false);
        btn_reset.setBorderPainted(false);

        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 130, 40));
        btn_keluar.setOpaque(false);
        btn_keluar.setContentAreaFilled(false);
        btn_keluar.setBorderPainted(false);

        btn_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_barangActionPerformed(evt);
            }
        });
        getContentPane().add(btn_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 90, 40));
        btn_barang.setOpaque(false);
        btn_barang.setContentAreaFilled(false);
        btn_barang.setBorderPainted(false);

        btn_montir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_montirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_montir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 90, 40));
        btn_montir.setOpaque(false);
        btn_montir.setContentAreaFilled(false);
        btn_montir.setBorderPainted(false);

        btn_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_notaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 90, 40));
        btn_nota.setOpaque(false);
        btn_nota.setContentAreaFilled(false);
        btn_nota.setBorderPainted(false);

        btn_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aboutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_about, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, 90, 40));
        btn_about.setOpaque(false);
        btn_about.setContentAreaFilled(false);
        btn_about.setBorderPainted(false);

        txt_passwordBaru.setBorder(null);
        txt_passwordBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordBaruActionPerformed(evt);
            }
        });
        getContentPane().add(txt_passwordBaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 280, 40));

        txt_ulangiPassword.setBorder(null);
        txt_ulangiPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ulangiPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ulangiPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 280, 40));

        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 90, 30));
        btn_transaksi.setOpaque(false);
        btn_transaksi.setContentAreaFilled(false);
        btn_transaksi.setBorderPainted(false);

        txt_passwordSebelumnya.setBorder(null);
        getContentPane().add(txt_passwordSebelumnya, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 270, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg_settings.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1271, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_montirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_montirActionPerformed
        try {
            dispose();
            new form_montir(Username, IDku).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_montirActionPerformed

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        try {
            dispose();
            new form_montir(Username, IDku).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_barangActionPerformed
        dispose();
        new form_barang(Username, IDku).setVisible(true);
    }//GEN-LAST:event_btn_barangActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        bersih();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void txt_ulangiPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ulangiPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ulangiPasswordActionPerformed

    private void txt_passwordBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordBaruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordBaruActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        String pass_Sebelumnya = txt_passwordSebelumnya.getText();
        String pass_Baru = txt_passwordBaru.getText();
        String ulangi_Pass = txt_ulangiPassword.getText();
        if (!pass_Sebelumnya.equals("")) {
            if (!pass_Baru.equals("")) {
                if (!ulangi_Pass.equals("")) {
                    if (pass_Baru.equals(ulangi_Pass)) {
                        try {
                            encryption enc = new encryption();
                            String passlogin = enc.encrypt(pass_Sebelumnya);
                            Statement state = kon.getConnection();
                            String query = "SELECT * FROM userlogin WHERE username = '" + Username + "' and password = '" + passlogin + "'";
                            ResultSet rs = state.executeQuery(query);

                            boolean masuk = false;
                            masuk = rs.next();

                            if (masuk) {
                                String passafter = enc.encrypt(ulangi_Pass);
                                String query2 = "UPDATE userlogin SET password = " + "'" + passafter + "' "
                                        + "WHERE username = '" + Username + "'";

                                Statement state2 = kon.getConnection();

                                int rs2 = state2.executeUpdate(query2);
                                if (rs2 == 1) {
                                    JOptionPane.showMessageDialog(null, "Password Sukses Diganti!", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error! Password Gagal Diganti!", "Pesan", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Password Sebelumnya Salah!", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(form_settings.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SQLException ex) {
                            Logger.getLogger(form_settings.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Password harus sama dengan sebelumnya!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ulangi Password Baru!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Masukkan Password Baru!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Masukkan Password Sebelumnya!");
        }
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_notaActionPerformed
        dispose();
        new form_nota(Username, IDku).setVisible(true);
    }//GEN-LAST:event_btn_notaActionPerformed

    private void btn_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aboutActionPerformed
        dispose();
        new form_about(Username, IDku).setVisible(true);
    }//GEN-LAST:event_btn_aboutActionPerformed

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        dispose();
        new form_transaksi(Username, IDku).setVisible(true);
    }//GEN-LAST:event_btn_transaksiActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form_settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_about;
    private javax.swing.JButton btn_barang;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_montir;
    private javax.swing.JButton btn_nota;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_passwordBaru;
    private javax.swing.JTextField txt_passwordSebelumnya;
    private javax.swing.JTextField txt_ulangiPassword;
    // End of variables declaration//GEN-END:variables
}

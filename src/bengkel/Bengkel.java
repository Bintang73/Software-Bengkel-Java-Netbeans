package bengkel;
import koneksi.myconnection;
import menu.form_login;

public class Bengkel {
    
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        new form_login().setVisible(true);
    }
        });
    }
    
}

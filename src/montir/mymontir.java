package montir;

public class mymontir {
    private String nama;

    public mymontir(String text, String text0, String text1, String text2, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    private String alamat;
    
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    private String telp;

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    private String email;

    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    } 

    public mymontir(String nama, String alamat, String telp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
        this.email = email;
        
    }
    
    private int kode;

    public int getKode() {
        return kode;
    }
    
    public void setKode(int kode) {
        this.kode = kode;
    }
    
    public mymontir(){}
}

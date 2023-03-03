package transaksi;

public class mytransaksi {

    public mytransaksi(int parseInt, String text, String text2, int parseInt1, int parseInt2, int parseInt3, String text3, String text4, int parseInt4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int kode_barang;

    public int getKodeBarang() {
        return kode_barang;
    }

    public void setKodeBarang(int kode_barang) {
        this.kode_barang = kode_barang;
    }

    private String nama_barang;

    public String getNamaBarang() {
        return nama_barang;
    }

    public void setNamaBarang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    private String nama_pembeli;

    public String getNamaPembeli() {
        return nama_pembeli;
    }

    public void setNamaPembeli(String nama_pembeli) {
        this.nama_pembeli = nama_pembeli;
    }

    private int harga;

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    private int jumlah;

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int uang_pembeli;

    public int getUang() {
        return uang_pembeli;
    }

    public void setUang(int uang_pembeli) {
        this.uang_pembeli = uang_pembeli;
    }

    private int kembalian;

    public int getKembalian() {
        return kembalian;
    }

    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String tanggal;

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    private int kode_montir;

    public int getKodeMontir() {
        return kode_montir;
    }

    public void setKodeMontir(int kode_montir) {
        this.kode_montir = kode_montir;
    }

    private String nama_montir;

    public String getNamaMontir() {
        return nama_montir;
    }

    public void setNamaMontir(String nama_montir) {
        this.nama_montir = nama_montir;
    }

    public mytransaksi(int kode_barang, String nama_barang, String nama_pembeli, int harga, int jumlah, int total, int uang_pembeli, int kembalian, int id, String tanggal, int kode_montir, String nama_montir) {
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.nama_pembeli = nama_pembeli;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
        this.uang_pembeli = uang_pembeli;
        this.kembalian = kembalian;
        this.id = id;
        this.tanggal = tanggal;
        this.kode_montir = kode_montir;
        this.nama_montir = nama_montir;
    }

    private int kode_transaksi;

    public int getKodeTransaksi() {
        return kode_transaksi;
    }

    public void setKodeTransaksi(int kode_transaksi) {
        this.kode_transaksi = kode_transaksi;
    }

    public mytransaksi() {
    }
}

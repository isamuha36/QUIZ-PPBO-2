import java.util.ArrayList;

class Dokter extends orang {
    private String nomorInduk;
    private String spesialisasi;
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    public Dokter(String nama, String tanggalLahir, orang.JENIS_KELAMIN jenisKelamin, String nomorInduk, String spesialisasi) {
        super(nama, tanggalLahir, jenisKelamin);
        this.nomorInduk = nomorInduk;
        this.spesialisasi = spesialisasi;
    }

    public void daftar(RumahSakit rumahSakit){
        rumahSakit.tambahDokter(this);
    }

    // Getters and Setters
    public String getNomorInduk() {
        return nomorInduk;
    }

    public void setNomorInduk(String nomorInduk) {
        this.nomorInduk = nomorInduk;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public ArrayList<Pasien> getDaftarPasien(){
        return daftarPasien;
    }
    public void setDaftarPasien(Pasien pasien){
        daftarPasien.add(pasien);
    }
}

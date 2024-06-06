public class Pasien extends orang{
    private String pekerjaan;
    private String domisili;
    public Pasien(String nama, String tanggalLahir, JENIS_KELAMIN jenisKelamin, String pekerjaan, String domisili) {
        super(nama, tanggalLahir, jenisKelamin);
        this.pekerjaan = pekerjaan;
        this.domisili = domisili;
    }

    public void daftar(RumahSakit rumahsakit, String keluhan, String namaDokter, Antrian.tipePasiens tipePasien){
        Antrian antrian = new Antrian(this, keluhan, namaDokter, tipePasien);
        rumahsakit.tambahAntrian(antrian);
    }

}

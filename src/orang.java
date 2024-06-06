abstract class orang {
    enum JENIS_KELAMIN {
        LAKI_LAKI,
        PEREMPUAN
    }

    private String nama;
    private String tanggalLahir;
    private JENIS_KELAMIN jenisKelamin;

    public orang(String nama, String tanggalLahir, JENIS_KELAMIN jenisKelamin) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
    }

    // Getters and Setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public JENIS_KELAMIN getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JENIS_KELAMIN jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
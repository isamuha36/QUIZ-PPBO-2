class Antrian {
    enum tipePasiens{
        MANDIRI,
        BPJS
    }

    private Pasien pasien;
    private String keluhan;
    private String namaDokter;
    private tipePasiens tipePasiens;

    public Antrian(Pasien pasien, String keluhan, String namaDokter, tipePasiens tipePasien) {
        this.pasien = pasien;
        this.keluhan = keluhan;
        this.namaDokter = namaDokter;
        this.tipePasiens = tipePasien;
    }

    // Getters and Setters
    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public tipePasiens getTipePasien() {
        return tipePasiens;
    }

    public void setTipePasiens(tipePasiens tipePasien) {
        this.tipePasiens = tipePasiens;
    }
}
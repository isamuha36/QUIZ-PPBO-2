import javax.swing.plaf.PanelUI;
import java.security.PublicKey;
import java.util.ArrayList;

public class RumahSakit {
    private String nama;
    private String alamat;
    private String telepon;
    private ArrayList<Dokter> daftarDokter = new ArrayList<Dokter>();
    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    public RumahSakit(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public void cekListDokter(){
        if (daftarDokter.size() == 0){
            System.out.println("BELUM ADA DOKTER YANG TERSEDIA SAAT INI");
        } else {
            System.out.println("BERIKUT LIST DOKTER YANG TERSEDIA SAAT INI");
            System.out.println("===========================================");
            for (Dokter dokter : daftarDokter){
                System.out.println("Nama Dokter: " + dokter.getNama() + ", Dokter spesialis : " + dokter.getSpesialisasi());

            }
        }
    }

    public void tambahDokter(Dokter dokter){
        if (daftarDokter.size() == 0){
            daftarDokter.add(dokter);
            System.out.println("SUKSES");
        } else {
            Boolean cek = false;
            for (Dokter dokter1 : daftarDokter){
                if (dokter1.getNomorInduk().equals(dokter.getNomorInduk())){
                    System.out.println("DOKTER SUDAH TERDAFTAR");
                    cek = true;
                    break;
                }
            }
            if (!cek){
                daftarDokter.add(dokter);
                System.out.println("SUKSES");
            }
        }
    }


    public void cekAntrianPasien(){
        System.out.println("ANTRIAN RUMAH SAKIT SAAT INI");
        for (Dokter dokter : daftarDokter){
            if (dokter.getDaftarPasien().size() == 0){
                System.out.println("DR. " + dokter.getNama());
                System.out.println("ANTRIAN KOSONG");
            } else {
                System.out.println("DOKTER " + dokter.getNama() + " MEMILIKI PASIEN SEBANYAK " + dokter.getDaftarPasien().size());
                System.out.println("===========================================");
                for (Pasien pasien : dokter.getDaftarPasien()){
                    System.out.println("Nama Pasien: " + pasien.getNama() + ", Tanggal Lahir : " + pasien.getTanggalLahir());
                }
            }
            System.out.println("===========================================");
        }
    }

    public void tambahAntrian(Antrian antrian){
        System.out.println(daftarPasien.size());
        if (daftarPasien.size() == 0){
            daftarPasien.add(antrian.getPasien());
            for(Dokter dokter : daftarDokter){
                if (dokter.getNama().equals(antrian.getNamaDokter())){
                    dokter.setDaftarPasien(antrian.getPasien());
                    System.out.println("SUKSES");
                    break;
                } else {
                    System.out.println("DOKTER TIDAK TERSEDIA");
                    break;
                }
            }
        } else {
            Boolean cek = false;
            for (Pasien pasien : daftarPasien){
                if (pasien.getNama().equals(antrian.getPasien().getNama()) && pasien.getTanggalLahir().equals(antrian.getPasien().getTanggalLahir())){
                    System.out.println("PASIEN SUDAH TERDAFTAR");
                    cek = true;
                    break;
                }
            }
        }
    }
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }
}

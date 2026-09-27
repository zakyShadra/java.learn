package id.ac.polban.pbo.kantin.model;

public class MahasiswaSalahPackage {

    private String nim;
    private String nama;

    public MahasiswaSalahPackage(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}

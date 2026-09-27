package id.ac.polban.pbo.kantin.app;

import id.ac.polban.pbo.kantin.model.Mahasiswa;

public class UjiConstructor {

    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        System.out.println("NIM  : " + m.getNim());
        System.out.println("Nama : " + m.getNama());
        System.out.println("Object berhasil dibuat, tetapi tanpa NIM/nama -> "
                + "tidak masuk akal untuk kasus kantin (BR-01).");
    }
}

package id.ac.polban.pbo.kantin.app;

import id.ac.polban.pbo.kantin.model.MahasiswaSalahPackage;

public class UjiPackageMismatch {

    public static void main(String[] args) {
        MahasiswaSalahPackage m = new MahasiswaSalahPackage("241001", "Asep");
        System.out.println(m.getNama());
    }
}

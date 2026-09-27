package id.ac.polban.pbo.kantin.app;

import id.ac.polban.pbo.kantin.model.Mahasiswa;
import id.ac.polban.pbo.kantin.model.MenuItem;
import id.ac.polban.pbo.kantin.model.Pesanan;

public class Main {

    public static void main(String[] args) {

        System.out.println("==========================================================");
        System.out.println(" PRAKTIKUM PBO - KANTIN KAMPUS MINI");
        System.out.println("==========================================================");

        System.out.println("\n[T-01] Dua Mahasiswa dari class yang sama");
        Mahasiswa m1 = new Mahasiswa("241001", "Asep");
        Mahasiswa m2 = new Mahasiswa("241002", "Siti");
        System.out.println(m1.getNim() + " - " + m1.getNama());
        System.out.println(m2.getNim() + " - " + m2.getNama());
        System.out.println("Class sama: " + (m1.getClass() == m2.getClass())
                + " | state berbeda: " + !m1.getNim().equals(m2.getNim()));

        System.out.println("\n[T-03] Dua MenuItem, satu ditandai habis");
        MenuItem nasi = new MenuItem("M01", "Nasi Goreng", 18000);
        MenuItem kopi = new MenuItem("M02", "Kopi Susu", 12000);
        kopi.tandaiHabis();
        System.out.println(nasi.getNama() + " tersedia: " + nasi.isTersedia());
        System.out.println(kopi.getNama() + " tersedia: " + kopi.isTersedia());

        System.out.println("\n[T-04] Tiga Pesanan, nomor dari counter static");
        Pesanan p1 = new Pesanan(m1, nasi, 2);
        Pesanan p2 = new Pesanan(m2, kopi, 1);
        Pesanan p3 = new Pesanan(m2, nasi, 0);
        System.out.println("Nomor p1 = " + p1.getNomor());
        System.out.println("Nomor p2 = " + p2.getNomor());
        System.out.println("Nomor p3 = " + p3.getNomor());

        System.out.println("\n[T-05] Menu tersedia + jumlah > 0  -> true");
        System.out.println("P1 dapat diproses: " + p1.dapatDiproses());

        System.out.println("\n[T-06] Menu habis                 -> false");
        System.out.println("P2 dapat diproses: " + p2.dapatDiproses());

        System.out.println("\n[T-07] Jumlah 0                   -> false");
        System.out.println("P3 dapat diproses: " + p3.dapatDiproses());

        System.out.println("\n[RINGKASAN PESANAN]");
        System.out.println(p1.ringkasan());
        System.out.println(p2.ringkasan());
        System.out.println(p3.ringkasan());

        System.out.println("\n[TASK 4] Bukti static counter");
        System.out.println("Jumlah Pesanan yang sudah diberi nomor: "
                + Pesanan.getJumlahPesananDibuat());

        System.out.println("\n[TASK 5] Bukti relationship (reference)");
        System.out.println("p1.getPemesan() == m1 : " + (p1.getPemesan() == m1));
        System.out.println("p1.getMenu()    == nasi: " + (p1.getMenu() == nasi));
        System.out.println("Harga dibaca dari object menu: Rp" + p1.getMenu().getHarga()
                + " x " + p1.getJumlah() + " = Rp" + p1.hitungTotal());

        System.out.println("\n[CHALLENGE A] Kasir - relationship uses-a");
        Kasir kasir = new Kasir();
        kasir.proses(p1);
        kasir.proses(p2);
        kasir.proses(p3);

        System.out.println("\n==========================================================");
        System.out.println(" Selesai. Program berjalan tanpa error package/import (T-08).");
        System.out.println("==========================================================");
    }
}

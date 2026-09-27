package id.ac.polban.pbo.kantin.app;

import id.ac.polban.pbo.kantin.model.Pesanan;

public class Kasir {

    public void proses(Pesanan pesanan) {
        if (pesanan.dapatDiproses()) {
            System.out.println("Pesanan #" + pesanan.getNomor() + " diproses");
        } else {
            System.out.println("Pesanan #" + pesanan.getNomor() + " ditolak");
        }
    }
}

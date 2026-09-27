package id.ac.polban.pbo.kantin.app;

import id.ac.polban.pbo.kantin.model.MenuItem;

public class UjiAksesPrivate {

    public static void main(String[] args) {
        MenuItem menu = new MenuItem("M01", "Nasi Goreng", 18000);
        System.out.println("Sebelum: tersedia = " + menu.isTersedia());

        menu.tersedia = false;

        System.out.println("Sesudah: tersedia = " + menu.isTersedia());
        System.out.println("State berubah tanpa lewat behavior tandaiHabis().");
    }
}

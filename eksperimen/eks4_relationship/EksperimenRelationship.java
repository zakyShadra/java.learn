package eksperimen.eks4;

public class EksperimenRelationship {

    static class MahasiswaDemo {
        private String nim;
        private String nama;

        MahasiswaDemo(String nim, String nama) {
            this.nim = nim;
            this.nama = nama;
        }

        String getNim() {
            return nim;
        }

        String getNama() {
            return nama;
        }

        void ubahNama(String namaBaru) {
            this.nama = namaBaru;
        }
    }

    static class MenuItemDemo {
        private String nama;
        private int harga;

        MenuItemDemo(String nama, int harga) {
            this.nama = nama;
            this.harga = harga;
        }

        String getNama() {
            return nama;
        }

        int getHarga() {
            return harga;
        }
    }

    static class PesananA {
        private MahasiswaDemo pemesan;
        private MenuItemDemo menu;
        private int jumlah;

        PesananA(MahasiswaDemo pemesan, MenuItemDemo menu, int jumlah) {
            this.pemesan = pemesan;
            this.menu = menu;
            this.jumlah = jumlah;
        }

        String ringkasan() {
            return "[Desain A/reference] " + pemesan.getNim() + " - " + pemesan.getNama()
                    + " | " + menu.getNama() + " x" + jumlah
                    + " | Rp" + (menu.getHarga() * jumlah);
        }
    }

    static class PesananB {
        private String nimPemesan;
        private String namaPemesan;
        private String namaMenu;
        private int hargaMenu;
        private int jumlah;

        PesananB(MahasiswaDemo pemesan, MenuItemDemo menu, int jumlah) {
            this.nimPemesan = pemesan.getNim();
            this.namaPemesan = pemesan.getNama();
            this.namaMenu = menu.getNama();
            this.hargaMenu = menu.getHarga();
            this.jumlah = jumlah;
        }

        String ringkasan() {
            return "[Desain B/copy]      " + nimPemesan + " - " + namaPemesan
                    + " | " + namaMenu + " x" + jumlah
                    + " | Rp" + (hargaMenu * jumlah);
        }
    }

    public static void main(String[] args) {
        MahasiswaDemo m = new MahasiswaDemo("241001", "Asep");
        MenuItemDemo menu = new MenuItemDemo("Nasi Goreng", 18000);

        PesananA pA = new PesananA(m, menu, 2);
        PesananB pB = new PesananB(m, menu, 2);

        System.out.println("=== Sebelum nama mahasiswa berubah ===");
        System.out.println(pA.ringkasan());
        System.out.println(pB.ringkasan());

        m.ubahNama("Asep Setiawan");

        System.out.println("\n=== Setelah nama mahasiswa berubah menjadi \"Asep Setiawan\" ===");
        System.out.println(pA.ringkasan());
        System.out.println(pB.ringkasan());

        System.out.println("\nKesimpulan:");
        System.out.println("- Desain A selalu menampilkan data terbaru (menyimpan reference).");
        System.out.println("- Desain B menyimpan copy lama -> data pesanan menjadi tidak sinkron.");
        System.out.println("- Desain B tetap ditolak secara permanen: program final memakai Desain A.");
    }
}

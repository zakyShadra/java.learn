package eksperimen.eks3;

public class PesananInstance {

    private int nextNumber = 1;
    private int nomor;

    public PesananInstance() {
        nomor = nextNumber++;
    }

    public int getNomor() {
        return nomor;
    }

    public static void main(String[] args) {
        System.out.println("=== Versi INSTANCE (static dihapus) ===");
        PesananInstance p1 = new PesananInstance();
        PesananInstance p2 = new PesananInstance();
        PesananInstance p3 = new PesananInstance();
        System.out.println("Nomor p1 = " + p1.getNomor());
        System.out.println("Nomor p2 = " + p2.getNomor());
        System.out.println("Nomor p3 = " + p3.getNomor());
        System.out.println("Tiap object punya counter sendiri -> semua nomor 1, tidak meningkat.");
    }
}

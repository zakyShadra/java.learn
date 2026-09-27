package eksperimen.eks3;

public class PesananStatic {

    private static int nextNumber = 1;
    private int nomor;

    public PesananStatic() {
        nomor = nextNumber++;
    }

    public int getNomor() {
        return nomor;
    }

    public static void main(String[] args) {
        System.out.println("=== Versi STATIC (nextNumber milik class) ===");
        PesananStatic p1 = new PesananStatic();
        PesananStatic p2 = new PesananStatic();
        PesananStatic p3 = new PesananStatic();
        System.out.println("Nomor p1 = " + p1.getNomor());
        System.out.println("Nomor p2 = " + p2.getNomor());
        System.out.println("Nomor p3 = " + p3.getNomor());
        System.out.println("Counter dibagi bersama -> nomor meningkat 1, 2, 3.");
    }
}

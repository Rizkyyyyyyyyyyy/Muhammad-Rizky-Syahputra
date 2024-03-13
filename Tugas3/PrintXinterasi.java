import java.util.Scanner;

public class PrintXinterasi {
    public static void main(String[] args) {
        int Sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in);
        
        // Instruksi untuk pengguna
        System.out.println("Masukkan nilai x (int), akhiri dengan 999:");
        
        x = masukan.nextInt(); // First Element
        if (x == 999) {
            System.out.println("Kasus kosong");
        } else {
            Sum = x; // Inisialisasi; invariant
            while (true) {
                System.out.println("Masukkan nilai x (int), akhiri dengan 999:");
                x = masukan.nextInt(); // Next Element
                if (x == 999)
                    break;
                else {
                    Sum = Sum + x; // Proses
                }
            }
        }
        
        // Output hasil penjumlahan
        System.out.println("Hasil penjumlahan = " + Sum);
        
        masukan.close(); // Menutup Scanner setelah digunakan
    }
}

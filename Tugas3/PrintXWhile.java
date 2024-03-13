import java.util.Scanner;

public class PrintXWhile {
    public static void main(String[] args) {
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);
        
        Sum = 0; // Inisialisasi
        
        // Instruksi untuk pengguna
        System.out.println("Masukkan nilai x (int), akhiri dengan 999 : ");
        x = masukan.nextInt(); // First Element
        
        while (x != 999) { // Kondisi berhenti
            Sum = Sum + x; // Proses
            
            // Instruksi untuk pengguna
            System.out.print("Masukkan nilai x (int), akhiri dengan 999 : ");
            x = masukan.nextInt(); // Next Element
        }
        
        // Output hasil penjumlahan
        System.out.println("Hasil penjumlahan = " + Sum); // Terminasi
        
        masukan.close(); // Menutup Scanner setelah digunakan
    }
}
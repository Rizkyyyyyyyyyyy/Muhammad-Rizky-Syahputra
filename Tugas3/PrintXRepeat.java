import java.util.Scanner;

public class PrintXRepeat {
    public static void main(String[] args) {
        int Sum;
        int x;
        Scanner masukan = new Scanner(System.in);
        
        // Instruksi untuk pengguna
        System.out.print("Masukkan nilai x (int), akhiri dengan 999 : ");
        x = masukan.nextInt(); // First Element
        
        if (x == 999) {
            System.out.println("Kasus kosong");
        } else {
            Sum = 0; // Inisialisasi; invariant
            
            do {
                Sum = Sum + x; // Proses
                System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
                x = masukan.nextInt(); // Next Element
            } while (x != 999); // Kondisi pengulangan
            
            // Output hasil penjumlahan
            System.out.println("Hasil penjumlahan = " + Sum);
        }
        
        masukan.close(); // Menutup Scanner setelah digunakan
    }
}

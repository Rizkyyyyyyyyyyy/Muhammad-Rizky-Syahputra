import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Langkah 1: Mendapatkan total detik melalui masukan keyboard
        System.out.print("Masukkan total detik: ");
        long totalDetik = input.nextLong();

        // Langkah 2: Hitung detik saat ini
        long detikSekarang = totalDetik % 60;

        // Langkah 3: Hitung total menit
        long totalMenit = totalDetik / 60;

        // Langkah 4: Hitung menit saat ini
        long menitSekarang = totalMenit % 60;

        // Langkah 5: Hitung total jam
        long totalJam = totalMenit / 60;

        // Langkah 6: Hitung jam saat ini
        long jamSekarang = totalJam % 24;

        // Langkah 7: Tampilkan waktu (Jam:Menit:Detik)
        System.out.println("Waktu: " + jamSekarang + ":" + menitSekarang + ":" + detikSekarang);

        input.close();
    }
}

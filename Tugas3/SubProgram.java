import java.util.Scanner;

public class SubProgram {
    public static int maxab(int a, int b) {
        // Mencari maksimum dua bilangan bulat
        return ((a >= b) ? a : b);
    }

    public static void tukar(int[] arr) {
        // Menukar dua bilangan bulat
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println("Kedua bilangan setelah tukar: a = " + arr[0] + ", b = " + arr[1]);
    }

    public static void main(String[] args) {
        // Membaca dua bilangan integer
        // Menuliskan maksimum dua bilangan yang dibaca dengan memanggil fungsi
        // Menukar kedua bilangan dengan 'prosedur'
        int a, b;
        Scanner masukan = new Scanner(System.in);

        System.out.println("Maksimum dua bilangan");
        System.out.println("Ketikkan dua bilangan, pisahkan dengan spasi:");

        a = masukan.nextInt();
        b = masukan.nextInt();

        System.out.println("Kedua bilangan: a = " + a + ", b = " + b);
        System.out.println("Maksimum = " + maxab(a, b));

        System.out.println("Tukar kedua bilangan...");
        int[] arr = {a, b};
        tukar(arr);
    }
}

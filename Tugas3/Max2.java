import java.util.Scanner;

public class Max2 {
    public static void main(String[] args) {
        int a, b;
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Maksimum dua bilangan:");
        System.out.println("Ketikkan dua bilangan, pisahkan dengan spasi:");
        a = masukan.nextInt(); 
        b = masukan.nextInt();
        System.out.println("Kedua bilangan: a = " + a + ", b = " + b);
        
        if (a >= b) {
            System.out.println("Nilai maksimum: a = " + a);
        } else {
            System.out.println("Nilai maksimum: b = " + b);
        }
    }
}

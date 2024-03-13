import java.util.Scanner;

public class prifor {
    public static void main(String[] args) {
        int N;
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("Baca N, print 1 s/d N");
        System.out.print("N = ");
        N = masukan.nextInt();
        
        if (N < 1) {
            System.out.println("Nilai N harus lebih besar dari atau sama dengan 1.");
        } else {
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
            
            System.out.println("Akhir program");
        }
        
        masukan.close(); // Menutup Scanner setelah digunakan
    }
}

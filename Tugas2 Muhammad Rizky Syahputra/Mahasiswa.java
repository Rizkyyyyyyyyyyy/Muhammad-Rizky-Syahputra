import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("MASUKKAN NIM: ");
        String nim = input.nextLine();
        
        System.out.print("MASUKKAN NAMA: ");
        String nama = input.nextLine();
        
        System.out.print("MASUKKAN JURUSAN: ");
        String jurusan = input.nextLine();
        
        System.out.print("MASUKKAN FAKULTAS: ");
        String fakultas = input.nextLine();
        
        System.out.println("\nData Anda:");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
        
        input.close();
    }
}


public class Mahasiswa extends Orang {
    private String stb;
    public Mahasiswa() {
        super();
        this.stb = "1302002134";
    }
    public Mahasiswa(String stb, String nama) {
        this.nama = nama;
        this.stb = stb;
    }
    public static void info() {
        System.out.println("Class Mahasiswa");
    }
} 

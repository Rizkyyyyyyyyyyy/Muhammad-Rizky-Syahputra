
public class Utama {
    public static void main(String[] args) {
        Orang.info(); 
        Mahasiswa.info(); 
    }
}


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

public class Orang {
    public String nama;
    public Orang() {
        this.nama = "Aminah";
    }
    public Orang(String nama) {
        this.nama = nama;
    }
    public static void info() {
        System.out.println("Class Orang");
    }
}

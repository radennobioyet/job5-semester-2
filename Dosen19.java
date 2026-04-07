public class Dosen19 {
    String kode, nama;
    boolean jenisKelamin; // true: Laki-laki, false: Perempuan
    int usia;

    // Konstruktor
    Dosen19(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    // Method tampil data dosen
    void tampil() {
        String jk = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println("Kode: " + kode + " | Nama: " + nama +
                " | Jenis Kelamin: " + jk + " | Usia: " + usia);
    }
}
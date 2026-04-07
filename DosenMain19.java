import java.util.Scanner;

public class DosenMain19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen19 daftar = new DataDosen19();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN POLINEMA ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data");
            System.out.println("3. Sorting ASC (Usia - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia - Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilih = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (pilih) {
                case 1:
                    System.out.print("Kode Dosen    : ");
                    String kd = sc.nextLine();
                    System.out.print("Nama Dosen    : ");
                    String nm = sc.nextLine();
                    System.out.print("JK (L/P)      : ");
                    boolean jk = sc.nextLine().equalsIgnoreCase("L");
                    System.out.print("Usia          : ");
                    int us = sc.nextInt();
                    daftar.tambah(new Dosen19(kd, nm, jk, us));
                    break;

                case 2:
                    System.out.println("\n=== Daftar Dosen ===");
                    daftar.tampil();
                    break;

                case 3:
                    daftar.SortingASC();
                    System.out.println("\nData berhasil diurutkan Termuda -> Tertua.");
                    daftar.tampil();
                    break;

                case 4:
                    daftar.sortingDSC();
                    System.out.println("\nData berhasil diurutkan Tertua -> Termuda.");
                    daftar.tampil();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);

        sc.close();
    }
}
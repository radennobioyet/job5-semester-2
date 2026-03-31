public class MainNilai {
    public static void main(String[] args) {

        NilaiMahasiswa data = new NilaiMahasiswa(8);

        // Data sesuai tabel
        data.uts = new int[]{78, 85, 90, 76, 92, 88, 80, 82};
        data.uas = new int[]{82, 88, 87, 79, 95, 85, 83, 84};

        // Output
        System.out.println("Nilai UTS Tertinggi (DC): " + data.maxUTS(0, data.n - 1));
        System.out.println("Nilai UTS Terendah (DC): " + data.minUTS(0, data.n - 1));

        // Format 2 angka desimal
        System.out.printf("Rata-rata UAS (BF): %.2f\n", data.rataUAS());
    }
}
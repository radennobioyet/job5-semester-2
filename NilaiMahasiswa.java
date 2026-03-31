public class NilaiMahasiswa {
    int uts[];
    int uas[];
    int n;

    public NilaiMahasiswa(int n) {
        this.n = n;
        uts = new int[n];
        uas = new int[n];
    }

    // Divide & Conquer - Max UTS
    public int maxUTS(int l, int r) {
        if (l == r) {
            return uts[l];
        }
        int mid = (l + r) / 2;
        int maxKiri = maxUTS(l, mid);
        int maxKanan = maxUTS(mid + 1, r);
        return (maxKiri > maxKanan) ? maxKiri : maxKanan;
    }

    // Divide & Conquer - Min UTS
    public int minUTS(int l, int r) {
        if (l == r) {
            return uts[l];
        }
        int mid = (l + r) / 2;
        int minKiri = minUTS(l, mid);
        int minKanan = minUTS(mid + 1, r);
        return (minKiri < minKanan) ? minKiri : minKanan;
    }

    // Brute Force - Rata-rata UAS
    public double rataUAS() {
        double total = 0;
        for (int i = 0; i < n; i++) {
            total += uas[i];
        }
        return total / n;
    }
}
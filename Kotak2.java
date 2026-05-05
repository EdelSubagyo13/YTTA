public class Kotak2 {
    int panjang, lebar, tinggi;

    // constructor kosong
    public Kotak2() {
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }

    // constructor berparameter
    public Kotak2(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int volume() {
        return panjang * lebar * tinggi;
    }
}
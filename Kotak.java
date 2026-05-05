public class Kotak {
    private int panjang, lebar, tinggi;

    public void setPanjang(int p) {
        panjang = p;
    }

    public void setLebar(int l) {
        lebar = l;
    }

    public void setTinggi(int t) {
        tinggi = t;
    }

    public int getPanjang() {
        return panjang;
    }

    public int luas() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    public int volume() {
        return panjang * lebar * tinggi;
    }
}
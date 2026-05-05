public class KotakHitam extends Kotak2 {
    String pesan;

    public KotakHitam(int p, int l, int t, String msg) {
        super(p, l, t);
        pesan = msg;
    }

    public void tampilPesan() {
        System.out.println(pesan);
    }
}
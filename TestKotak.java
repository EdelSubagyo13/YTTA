public class TestKotak {
    public static void main(String[] args) {
        Kotak k1 = new Kotak();

        k1.setPanjang(10);
        k1.setLebar(15);
        k1.setTinggi(4);

        System.out.println("Volume = " + k1.volume());
        System.out.println("Luas = " + k1.luas());
    }
}
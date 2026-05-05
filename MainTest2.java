public class MainTest2 {
    public static void main(String[] args) {

        // Titik
        Titik t1 = new Titik(2, 3);
        t1.tampil();

        // Titik3D
        Titik3D t2 = new Titik3D(2, 3, 4);
        t2.tampil();

        // Konversi
        Konversi k = new Konversi(5000);
        System.out.println("Meter ke KM = " + k.meterKeKilo());
        System.out.println("KM ke Meter = " + k.kiloKeMeter());
    }
}
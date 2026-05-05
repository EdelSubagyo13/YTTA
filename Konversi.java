public class Konversi {
    double jarak; // meter

    public Konversi(double jarak) {
        this.jarak = jarak;
    }

    public double meterKeKilo() {
        return jarak / 1000;
    }

    public double kiloKeMeter() {
        return jarak * 1000;
    }
}
public class Fungsi {
    public static void main(String[] args) {
        int x = 8;
        int hasil;

        hasil = (2 * x * x * x * x)
              + (5 * x * x * x)
              + (6 * x * x)
              - (4 * x)
              - 27;

        System.out.println("Nilai f(x) = " + hasil);
    }
}
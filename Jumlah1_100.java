public class Jumlah1_100 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 100; i++) {
            total += i;
        }

        System.out.println("Jumlah 1 sampai 100 = " + total);
    }
}
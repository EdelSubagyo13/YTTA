import java.util.Scanner;

public class BinerTerbalik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = input.nextInt();

        String biner = "";

        while (angka > 0) {
            biner += (angka % 2);
            angka /= 2;
        }

        System.out.println("Biner terbalik: " + biner);
    }
}
import java.util.Scanner;

public class BalikKalimat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        String[] kata = kalimat.split(" ");

        System.out.print("Hasil: ");
        for (int i = kata.length - 1; i >= 0; i--) {
            System.out.print(kata[i] + " ");
        }
    }
}
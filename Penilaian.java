import java.util.Scanner;

public class Penilaian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        if (nilai > 80) {
            System.out.println("Nilai A - Lulus Memuaskan");
        } else if (nilai > 70) {
            System.out.println("Nilai B - Lulus Baik");
        } else if (nilai > 60) {
            System.out.println("Nilai C - Lulus Cukup");
        } else if (nilai > 50) {
            System.out.println("Nilai D - Tidak Lulus");
        } else {
            System.out.println("Nilai E - Tidak Lulus");
        }
    }
}
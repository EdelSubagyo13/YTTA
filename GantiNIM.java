import java.util.Scanner;

public class GantiNIM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input NIM Anda: ");
        String nim = input.nextLine();

        String hasil = nim.replace('1', '*');

        System.out.println("NIM Anda menjadi: " + hasil);
    }
}
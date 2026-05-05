import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        String[] tabel = {"ari", "gali", "ika", "rozi"};

        // try-with-resources: Scanner akan otomatis ditutup
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();

            boolean found = false;

            // Enhanced for loop
            for (String item : tabel) {
                if (item.equalsIgnoreCase(nama)) {
                    System.out.println(nama + " terdaftar");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(nama + " tidak ditemukan");
            }
        }
    }
}

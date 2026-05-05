public class Kelipatan5dan9 {
    public static void main(String[] args) {
        System.out.println("Bilangan yang habis dibagi 5 atau 9:");

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 || i % 9 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
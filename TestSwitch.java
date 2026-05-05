public class TestSwitch {
    public static void main(String[] args) {
        char c = '-';

        switch (c) {
            case '+':
                System.out.println("Operasi penjumlahan");
                break;
            case '-':
                System.out.println("Operasi pengurangan");
                break;
            case '/':
                System.out.println("Operasi pembagian");
                break;
            case '*':
                System.out.println("Operasi perkalian");
                break;
            default:
                System.out.println("Operasi tidak dikenal");
        }
    }
}

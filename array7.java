public class array7 {
    public static void main(String[] args) {
        String[] s = {"aku", "kamu", "dia", "saya"};

        System.out.println("Jumlah elemen s = " + s.length);

        for (String item : s) {
            System.out.println(item + " panjang = " + item.length());
        }
    }
}

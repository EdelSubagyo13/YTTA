import java.util.StringTokenizer;

public class TestToken {
    public static void main(String[] args) {
        String kalimat = "Di sini Pencerahan Bersemi";

        StringTokenizer st = new StringTokenizer(kalimat, " ");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
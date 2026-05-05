import java.io.*;
import java.util.StringTokenizer;

public class TokenFile {

    public static void main(String[] args) {
        TokenFile tt = new TokenFile();
        tt.dbTest();
    }

    public void dbTest() {
        BufferedReader br = null;

        try {
            File file = new File("customer.txt");
            br = new BufferedReader(new FileReader(file));

            String dbRecord;

            // membaca file baris per baris
            while ((dbRecord = br.readLine()) != null) {

                // memecah string berdasarkan ":"
                StringTokenizer st = new StringTokenizer(dbRecord, ":");

                String namaDepan = st.nextToken();
                String namaBelakang = st.nextToken();
                String kota = st.nextToken();
                String propinsi = st.nextToken();

                System.out.println("Nama Depan   : " + namaDepan);
                System.out.println("Nama Belakang: " + namaBelakang);
                System.out.println("Kota         : " + kota);
                System.out.println("Provinsi     : " + propinsi);
                System.out.println("-----------------------------");
            }

        } catch (IOException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Gagal menutup file");
            }
        }
    }
}
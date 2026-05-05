public class NilaiMahasiswa {
    public static void main(String[] args) {

        String[] nama = {"Udon", "Dany", "Rissa", "Tino", "Flo"};

        int[][] nilai = {
            {80, 85, 90},
            {79, 80, 78},
            {90, 97, 89},
            {90, 88, 89},
            {90, 67, 99}
        };

        double na;

        for (int i = 0; i < nama.length; i++) {
            int uts = nilai[i][0];
            int uas = nilai[i][1];
            int tugas = nilai[i][2];

            na = (0.35 * uts) + (0.45 * uas) + (0.2 * tugas);

            System.out.println("Nama : " + nama[i]);
            System.out.println("Nilai Akhir : " + na);
            System.out.println("----------------------");
        }
    }
}
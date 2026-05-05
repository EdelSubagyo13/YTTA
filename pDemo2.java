public class pDemo2 extends P {
    int b = 10;

    @Override
    public void cetak() {
        System.out.println("Class aktual: b = " + b);
        super.cetak(); // memanggil method dari class P
    }

    public static void main(String[] args) {
        pDemo2 p = new pDemo2();
        p.cetak();
    }
}
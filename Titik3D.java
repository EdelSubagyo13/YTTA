public class Titik3D extends Titik {
    int z;

    public Titik3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    @Override
    public void tampil() {
        System.out.println("Titik (" + x + ", " + y + ", " + z + ")");
    }
}
class A {
    void cetak() {
        System.out.println("Class A");
    }
}

class B extends A {
    @Override
    void cetak() {
        System.out.println("Class B (override)");
    }
}

public class MainTest {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        objA.cetak();  // memanggil method dari class A
        objB.cetak();  // memanggil method override dari class B
    }
}

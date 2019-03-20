package Exercise5;

import Exercise5.ownpackage.AnInterface;

public class ImplementInterface implements AnInterface {
    @Override
    public void f() {
        System.out.println("ImplementInterface.f");
    }

    @Override
    public void g() {
        System.out.println("ImplementInterface.g");
    }

    @Override
    public void h() {
        System.out.println("ImplementInterface.h");
    }

    public static void main(String args[]) {
        ImplementInterface imp = new ImplementInterface();
        imp.f();
        imp.g();
        imp.h();

    }
}

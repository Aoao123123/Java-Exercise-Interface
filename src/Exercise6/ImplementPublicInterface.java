package Exercise6;

import Exercise6.ownpackage.AnInterface;

public class ImplementPublicInterface implements AnInterface {
    @Override
     public void f() {  //實現接口時，在接口中被定義的方法必須被定義為是public的
        System.out.println("ImplementInterface.f");
    }

    @Override
     public void g() {  //實現接口時，在接口中被定義的方法必須被定義為是public的
        System.out.println("ImplementInterface.g");
    }

    @Override
    public void h() {  //實現接口時，在接口中被定義的方法必須被定義為是public的
        System.out.println("ImplementInterface.h");
    }

    public static void main(String args[]) {
        ImplementPublicInterface imp = new ImplementPublicInterface();
        imp.f();
        imp.g();
        imp.h();

    }
}

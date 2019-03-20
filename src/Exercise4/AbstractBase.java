package Exercise4;

public class AbstractBase {
    public static void test1(NoMethods nm) {
        ((Extended1)nm).f();//需要向下轉型
    }
    public static void test2(WithMethods wm) {
        wm.f();//不需要向下轉型
    }
    public static void main(String args[]) {
        NoMethods nm = new Extended1();
        test1(nm);
        WithMethods wm = new Extended2();
        test2(wm);
    }
}

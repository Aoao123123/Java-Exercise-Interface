package Exercise3;

public class DerviedWithPrint extends BaseWithPrint {
    int i = 47;
    @Override
    public void print() {
        System.out.println("i = " + i);
    }
}

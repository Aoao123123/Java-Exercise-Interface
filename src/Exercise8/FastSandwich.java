package Exercise8;

public class FastSandwich extends Sandwich implements FastFood {
    @Override
    public void rushOrder() {
        System.out.println("Rushing your sandwich order");
    }

    @Override
    public void gobble() {
        System.out.println("Chomp! Snort! Gobble!");
    }
}

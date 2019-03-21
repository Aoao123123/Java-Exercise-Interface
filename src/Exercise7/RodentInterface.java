package Exercise7;

public class RodentInterface {
    public static void main(String args[]) {
        Rodent[] rodents = {new Mouse(),new Gerbil(),new Hamster()};
        for(Rodent r : rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            System.out.println(r);
        }
    }

}

package Exercise1;

public class Mouse extends Rodent {
    public void hop() {
        System.out.println("Mouse hopping");
    }
    public void scurry() {
        System.out.println("Mouse scurrying");
    }
    public void reproduce() {
        System.out.println("Making more Mice");
    }
    public String toString() {
        return "Mouse";
    }
}

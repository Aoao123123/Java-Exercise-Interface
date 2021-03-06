package Exercise9;

public class AbstractMusic5 {
    static void tune(Instrument i) {
        i.adjust();
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }
    public static void main(String args[]) {
        Instrument[] orchestra = {new Wind(),new Percussion(),new Stringed(),new Brass(),new WoodWind()};
        tuneAll(orchestra);
    }
}

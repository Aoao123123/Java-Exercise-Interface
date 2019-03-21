package Exercise10;

public class PlayableMusic5 {
    static void tune(Playable p) {
        p.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e) {
        for (Playable p : e) {
            tune(p);
        }
    }
    public static void main(String[] args) {
        Playable[] orchestra = {new Wind(),new Percussion(),new Stringed(),new Brass(),new WoodWInd()};
        tuneAll(orchestra);
    }
}

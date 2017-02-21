package module9.testCore;

/**
 * Created by GodMod on 2/11/2017.
 */
public class DogShow {
    public static void main(String[] args) {
        new DogShow().go();
    }

    void go() {
        new Hound().bark();
        ((Dog) new Hound()).bark();
        ((Dog) new Hound()).sniff();
    }
}

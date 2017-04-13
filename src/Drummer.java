public class Drummer extends Artist implements Musician{

    public Drummer(Human human, String pseudonym) {
        super(human, pseudonym);
    }

    @Override
    public void play() {
        System.out.println("playing drums");
    }
}


public class GuitarPlayer extends Artist implements Musician{

    public GuitarPlayer(Human human, String pseudonym){
        super(human, pseudonym);
    }

    @Override
    public void play() {
        System.out.println("playing the guitar");
    }
}

public class DancerDisco extends Artist implements Dancer{

    public DancerDisco(Human human, String pseudonym) {
        super(human, pseudonym);
    }

    @Override
    public void dance() {
        System.out.println("dancing disco");
    }
}

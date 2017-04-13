public class ValseDancer extends Artist implements Dancer {

    public ValseDancer(Human human, String pseudonym) {
        super(human, pseudonym);
    }

    @Override
    public void dance() {
        System.out.println("dancing valse");
    }
}

public class OperaSinger extends Artist implements Singer{

    public OperaSinger(Human human, String pseudonym) {
        super(human, pseudonym);
    }

    @Override
    public void sing() {
        System.out.println("singing opera");
    }
}

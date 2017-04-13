public class PopSinger extends Artist implements Singer{

    public PopSinger(Human human, String pseudonym) {
        super(human, pseudonym);
    }

    @Override
    public void sing() {
        System.out.println("singing pop");
    }
}

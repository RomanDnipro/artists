import java.util.Random;

public class RandomSkill {

    private static Random random = new Random();
    private static int totalQuantityOfSkills = 6;

    static Artist randSkill(Human human, String pseudonym){
        switch (random.nextInt(totalQuantityOfSkills)){
            case 0:
                return new DancerDisco(human, pseudonym);

            case 1:
                return new ValseDancer(human, pseudonym);

            case 2:
                return new Drummer(human, pseudonym);

            case 3:
                return new GuitarPlayer(human, pseudonym);

            case 4:
                return new OperaSinger(human, pseudonym);

            case 5:
                return new PopSinger(human, pseudonym);

            default:
                return null;
        }
    }
}


//    public static int getTotalQuantityOfSkills() {
//        return totalQuantityOfSkills;
//    }
//    public static void setTotalQuantityOfSkills(int totalQuantityOfSkills) {
//        RandomSkill.totalQuantityOfSkills = totalQuantityOfSkills;
//    }

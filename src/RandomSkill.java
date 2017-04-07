import java.util.Random;

/**
 * Created by Роман on 02.04.2017.
 */
public class RandomSkill {

    private static Random random = new Random();

    private static int totalQuantityOfSkills = 6;

    public static int getTotalQuantityOfSkills() {
        return totalQuantityOfSkills;
    }

    public static void setTotalQuantityOfSkills(int totalQuantityOfSkills) {
        RandomSkill.totalQuantityOfSkills = totalQuantityOfSkills;
    }

    static Artist randSkill(){
        switch (random.nextInt(totalQuantityOfSkills)/*(int) (Math.random() * (getTotalQuantityOfSkills() + 1))*/){
            case 0:
                return new DancerDisco();

            case 1:
                return new ValseDancer();

            case 2:
                return new Drummer();

            case 3:
                return new GuitarPlayer();

            case 4:
                return new OperaSinger();

            case 5:
                return new PopSinger();

            default:
                return null;
        }
    }
}

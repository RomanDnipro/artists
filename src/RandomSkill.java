/**
 * Created by Роман on 02.04.2017.
 */
public class RandomSkill {

    private static int totalQuantityOfSkills = 6;

    public static int getTotalQuantityOfSkills() {
        return totalQuantityOfSkills;
    }

    public static void setTotalQuantityOfSkills(int totalQuantityOfSkills) {
        RandomSkill.totalQuantityOfSkills = totalQuantityOfSkills;
    }

    static Skill randSkill(){
        switch ((int) (Math.random() * (getTotalQuantityOfSkills() + 1))){
            case 0:
                return new DancerDisco();
                //break;

            case 1:
                return new ValseDancer();
                //break;

            case 2:
                return new Drummer();
                //break;

            case 3:
                return new GuitarPlayer();
                //break;

            case 4:
                return new OperaSinger();
                //break;

            case 5:
                return new PopSinger();
                //break;
        }
        return null;
    }
}

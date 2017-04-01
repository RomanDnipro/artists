import java.util.Scanner;

/**
 * Created by Роман on 30.03.2017.
 */
public class Artist extends Human{

    private String pseudonym;
    private Skill skill;

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Artist(Human human) {
        this.setName(human.getName());
        this.setAge(human.getAge());
    }


}

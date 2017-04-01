import java.util.Scanner;

/**
 * Created by Роман on 30.03.2017.
 */
public class Academy {

    Artist teach(Human human, String pseudonym, Skill skill){
        Artist artist = new Artist();
        artist.setName(human.getName());
        artist.setAge(human.getAge());
        artist.setPseudonym(pseudonym);
        artist.setSkill(skill);
        return artist;
    }
}
//геттеры и сеттеры //done
//также сканнер вынести //done

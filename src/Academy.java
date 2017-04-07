/**
 * Created by Роман on 30.03.2017.
 */
public class Academy {

    Artist teach(Human human, String pseudonym){
        Artist artist = RandomSkill.randSkill();
        artist.setHuman(human);
//        artist.setName(human.getName());
//        artist.setAge(human.getAge());
        artist.setPseudonym(pseudonym);
        return artist;
    }
}
//геттеры и сеттеры //done
//также сканнер вынести //done

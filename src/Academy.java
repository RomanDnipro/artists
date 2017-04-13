import java.util.Scanner;

public class Academy {

    Artist teach(Human human, String pseudonym){

        Artist artist = RandomSkill.randSkill(human, pseudonym);
        return artist;
    }

    Artist[] teach(Human[] humans, Scanner sc){

        Artist[] artists = new Artist[humans.length];
        String pseudonym = null;
        Validator validator = new Validator();

        for (int i = 0; i < artists.length; i++) {

            do {
                System.out.println("Enter the pseudonym of " + (i+1) + " artist:");
                pseudonym = sc.nextLine();
            }
            while (! validator.isNameValid(pseudonym));
            artists[i] = teach(humans[i], pseudonym);
        }
        return artists;
    }

}
//геттеры и сеттеры //done
//также сканнер вынести //done

// лучше использовать конструктор, а не setHuman(т.к. КАЖДОМУ//done
// артисту задаём поля- избегаем риска не проинициализации
// полей)
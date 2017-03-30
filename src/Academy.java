import java.util.Scanner;

/**
 * Created by Роман on 30.03.2017.
 */
public class Academy {

    Artist teach(Human human){
        Artist artist = new Artist();
        artist.name = human.name;
        artist.age = human.age;
        System.out.println("Enter the pseudonym of " + Artist.quantity + " artist:");
        Scanner sc = new Scanner(System.in);
        artist.pseudonym = sc.nextLine();
        return artist;
    }
}

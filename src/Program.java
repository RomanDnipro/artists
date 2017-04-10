import java.util.Scanner;

/**
 * Created by Роман on 30.03.2017.
 */
public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /**
         * Creating people
         */
        System.out.println("Input the name and the age of the human (use a 'Enter'key between them): ");
        Human human1 = new Human(sc.nextLine(),Integer.parseInt(sc.nextLine()));
        System.out.println("Input the name and the age of the human (use a 'Enter'key between them): ");
        Human human2 = new Human(sc.nextLine(),Integer.parseInt(sc.nextLine()));
        System.out.println("Input the name and the age of the human (use a 'Enter'key between them): ");
        Human human3 = new Human(sc.nextLine(),Integer.parseInt(sc.nextLine()));

        /**
         * Creating academy.
         * The academy accepted people.
         * Set the pseudonym for artists,
         * each artist accepted random skill
         * (they become certain artist, like drummer)
         */
        Academy academy = new Academy();
        System.out.println("Enter the pseudonym of artist:");
        Artist artist1 = academy.teach(human1, sc.nextLine());
        System.out.println("Enter the pseudonym of artist:");
        Artist artist2 = academy.teach(human2, sc.nextLine());
        System.out.println("Enter the pseudonym of artist:");
        Artist artist3 = academy.teach(human3, sc.nextLine());

        /**
         * Creating concert.
         * We give an array of artists to concert.
         * And call it's methods
         */
        Concert concert = new Concert(new Artist[]{artist1, artist2, artist3});

        concert.introduceAnArtists();
        concert.show();
    }
}

//   Создаём людей вручную )))
//    Human h1 = new Human();
//        System.out.println("Enter the name and age of the human (use a space): ");
//                h1.setName(sc.nextLine());
//                System.out.println("Enter the age of the human:");
//                h1.setAge(Integer.parseInt(sc.nextLine()));
//
//                Human h2 = new Human();
//                System.out.println("Enter the name of the human:");
//                h2.setName(sc.nextLine());
//                System.out.println("Enter the age of the human:");
//                h2.setAge(Integer.parseInt(sc.nextLine()));
//
//                Human h3 = new Human();
//                System.out.println("Enter the name of the human:");
//                h3.setName(sc.nextLine());
//                System.out.println("Enter the age of the human:");
//                h3.setAge(Integer.parseInt(sc.nextLine()));

//обучать группу артистов в цикле  группу людей также

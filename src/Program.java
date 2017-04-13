import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator();

        /*
        Creating and initializing
        a group of people
         */
        Human[] groupOfHumans = null;
        {
            //Creating the valid-length array
            do {
                System.out.println("Enter a quantity of humans group(positive number):");
                try {
                    groupOfHumans = new Human[Integer.parseInt(sc.nextLine())];
                } catch (Exception e) {}
            } while (! validator.isArrValid(groupOfHumans));

            //Initialization the array by valid values
            for (int i = 0; i < groupOfHumans.length; i++) {
                groupOfHumans[i] = new Human();

                System.out.println("Enter the name of the " + (i + 1) + " human:");
                String nameOfHuman = sc.nextLine();
                while (! validator.isNameValid(nameOfHuman)) {
                    System.out.println("Not valid name, try again:");
                    nameOfHuman = sc.nextLine();
                }
                groupOfHumans[i].setName(nameOfHuman);

                System.out.println("Enter the age of the " + (i + 1) + " human:");
                String ageStringOfHuman = null;
                int ageOfHuman = 0;
                int startOfAgeRange = 15;
                int endOfAgeRange = 100;
                do {
                    System.out.println("Usage: " + startOfAgeRange + " - " + endOfAgeRange + ":");
                    ageStringOfHuman = sc.nextLine();
                    try {
                        ageOfHuman = Integer.parseInt(ageStringOfHuman);
                    } catch (Exception e) {}
                }while (! validator.isAgeRangeValid(15, 100, ageOfHuman));

                groupOfHumans[i].setAge(ageOfHuman);
            }
        }

        /*
         Creating academy.
         The academy accepted people.
         Set the pseudonym for artists,
         each artist accepted random skill
         (they become certain artist,
         like drummer or disco dancer)
         */
        Academy academy = new Academy();

        /*
         Creating concert.
         We give an array of artists to concert.
         And call it's methods
         */
        Concert concert = new Concert(academy.teach(groupOfHumans,sc));
        concert.introduceAnArtists();
        concert.show();

//        System.out.println("Enter the pseudonym of artist:");
//        Artist artist1 = academy.teach(human1, sc.nextLine());
//        System.out.println("Enter the pseudonym of artist:");
//        Artist artist2 = academy.teach(human2, sc.nextLine());
//        System.out.println("Enter the pseudonym of artist:");
//        Artist artist3 = academy.teach(human3, sc.nextLine());



    }
}


//
//        /**
//         * Creating concert.
//         * We give an array of artists to concert.
//         * And call it's methods
//         */
//        Concert concert = new Concert(new Artist[]{artist1, artist2, artist3});
//
//        concert.introduceAnArtists();
//        concert.show();


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

//обучать группу артистов в цикле, также создавать группу людей также

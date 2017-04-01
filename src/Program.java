import java.util.Scanner;

/**
 * Created by Роман on 30.03.2017.
 */
public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Input the name and the age of the human (use a 'Enter'key between them): ");
        Human h1 = new Human(sc.nextLine(),Integer.parseInt(sc.nextLine()));
        System.out.println("Input the name and the age of the human (use a 'Enter'key between them): ");
        Human h2 = new Human(sc.nextLine(),Integer.parseInt(sc.nextLine()));
        System.out.println("Input the name and the age of the human (use a 'Enter'key between them): ");
        Human h3 = new Human(sc.nextLine(),Integer.parseInt(sc.nextLine()));
//        System.out.println(h1.getName() + " " + h1.getAge());
//        System.out.println(h2.getName() + " " + h2.getAge());
//        System.out.println(h3.getName() + " " + h3.getAge());







//        Academy academy = new Academy();
//        Artist artist1 = academy.teach(h1);
//        System.out.println(artist1.name);
//        System.out.println(artist1.age);
//        System.out.println(artist1.pseudonym);
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

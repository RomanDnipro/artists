/**
 * Created by Роман on 30.03.2017.
 */
public class Program {
    public static void main(String[] args) {

        Human h1 = new Human();
        Academy academy = new Academy();
        Artist artist1 = academy.teach(h1);
        System.out.println(artist1.name);
        System.out.println(artist1.age);
        System.out.println(artist1.pseudonym);
    }
}

import java.util.Scanner;

/**
 * Created by Роман on 30.03.2017.
 */
public class Human {
    static int quantity;
    String name;
    int age;

    public Human() {
        quantity++;
        System.out.println("Enter the name of the " + quantity + " human:");
        Scanner sc1 = new Scanner(System.in);
        this.name = sc1.nextLine();
        System.out.println("Enter the age of the " + quantity + " human:");
        Scanner sc2 = new Scanner(System.in);
        this.age = sc2.nextInt();
    }
}

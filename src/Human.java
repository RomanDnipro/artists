/**
 * Created by Роман on 30.03.2017.
 */
public class Human {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
//вынести сканнер и sout нахрен отсюда //done
//везде инкапсулировать поля // done




//    public Human() {
//        System.out.println("Enter the name of the human:");
//        Scanner sc = new Scanner(System.in);
//        this.name = sc.nextLine();
//        System.out.println("Enter the age of the human:");
//        this.age = Integer.parseInt(sc.nextLine());
//    }
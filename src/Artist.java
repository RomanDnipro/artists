/**
 * Created by Роман on 30.03.2017.
 */
abstract public class Artist /*extends Human */{

    private String pseudonym;
    private Human human;

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public String getName(){
        return human.getName();
    }

    public void setName(String name){
        this.human.setName(name);
    }

    public int getAge(){
        return human.getAge();
    }

    public void setAge(int age){
        this.human.setAge(age);
    }

    public Artist() {
    }

    public Artist(String pseudonym, Human human) {

        this.pseudonym = pseudonym;
        this.human = human;
    }
}

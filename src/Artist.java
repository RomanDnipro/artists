abstract public class Artist /*extends Human */{

    private Human human;
    private String pseudonym;

    public String getPseudonym() {
        return pseudonym;
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
    public int getAge(){
        return human.getAge();
    }

    public Artist() {}
    public Artist(Human human, String pseudonym) {

        this.pseudonym = pseudonym;
        this.human = human;
    }
}


//    public String getPseudonym() {
//        return pseudonym;
//    }
//    public void setPseudonym(String pseudonym) {
//        this.pseudonym = pseudonym;
//    }
//    public Human getHuman() {
//        return human;
//    }
//    public void setHuman(Human human) {
//        this.human = human;
//    }
//    public String getName(){
//        return human.getName();
//    }
//    public void setName(String name){
//        this.human.setName(name);
//    }
//    public int getAge(){
//        return human.getAge();
//    }
//    public void setAge(int age){
//        this.human.setAge(age);
//    }


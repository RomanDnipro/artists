/**
 * Created by Роман on 30.03.2017.
 */
public class Concert {

    private Artist[] troupe;

    public Artist[] getTroupe() {
        return troupe;
    }

    public void setTroupe(Artist[] troupe) {
        this.troupe = troupe;
    }

    public Concert(Artist[] artists){
        this.troupe = artists;
    }

    void introduceAnArtists(){
        for (Artist artist : troupe){
            System.out.println(artist.getName() + " " + artist.getAge() + " years " + artist.getPseudonym());
        }
    }

    void show(){
        for (Artist artist : troupe){
            System.out.print(artist.getPseudonym() + " ");
            artist.getSkill()._do();
        }
    }
}

import java.util.Arrays;

/**
 * Created by Роман on 30.03.2017.
 */
public class Concert {

    Artist[] troupe;

    public Concert(Artist[] artists){
        this.troupe = artists;
    }

    void introduceAnArtists(){
        for (Artist artist : troupe){
            System.out.println(artist.name + " " + artist.age + " years " + artist.pseudonym);
        }
    }
    void show(){
        for (Artist artist : troupe){

        }
    }
}

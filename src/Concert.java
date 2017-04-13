public class Concert {

    private Artist[] troupe;

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
            if (artist instanceof Dancer){
                System.out.print(artist.getPseudonym() + " is ");
                ((Dancer) artist).dance();
            } else if (artist instanceof Singer){
                    System.out.print(artist.getPseudonym() + " is ");
                    ((Singer) artist).sing();
            } else if (artist instanceof Musician){
                    System.out.print(artist.getPseudonym() + " is ");
                    ((Musician) artist).play();
            }
        }
    }

}


//    public Artist[] getTroupe() {
//        return troupe;
//    } //не  используются
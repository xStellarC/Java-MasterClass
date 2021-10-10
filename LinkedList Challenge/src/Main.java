import java.util.ArrayList;

public class Main {

    private ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep purple") {
        Album.addSong("Stormbringer",4.6)
                Album.addSong("Love dont mean a thing",4.22)
                Album.addSong("Holy man",4.3)
                Album.addSong("Hold on",5.6)
                Album.addSong("Lady double dealer",3.21)
                Album.addSong("You can't do it right",6.23)
                Album.addSong("High ball shooter",4.27)
                Album.addSong("The gypsy",4.2)
                Album.addSong("Soldier of fortune",3.13)
                albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        }
    }

}

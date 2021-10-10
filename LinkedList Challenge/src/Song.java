public class Song {

    private double duration;

    private String title;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }

    public String getTitle() {
        return title;
    }

}

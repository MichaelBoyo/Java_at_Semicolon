package C9_Java;

public class AudioBook extends Book{

    public AudioBook(String title, String yearOfPublication, String authorFirstName, String authorLastName, int size, int playLength, String artistFirstName, String artistLastName) {
        super(title, yearOfPublication, authorFirstName, authorLastName);
        this.size = size;
        this.playLength = playLength;
        this.artistFirstName = artistFirstName;
        this.artistLastName = artistLastName;
    }
    private final int size;
    private final int playLength;
    private final String artistFirstName;
    private final String artistLastName;

    public int getSize() {
        return size;
    }

    public int getPlayLength() {
        return playLength;
    }

    public String getArtistFirstName() {
        return artistFirstName;
    }

    public String getArtistLastName() {
        return artistLastName;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("""
                Size: %d MB
                play Length: %d Minutes
                Artist: %s %s
                """,getSize(),getPlayLength(),getArtistFirstName(),getArtistLastName());
    }
}

package C9_Java;

public class Book {
    private final String title;
    private final String yearOfPublication;
    private final String authorFirstName;
    private final String authorLastName;

    public Book(String title, String yearOfPublication, String authorFirstName, String authorLastName) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    public String getTitle() {
        return title;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    @Override
    public String toString() {
        return String.format("""
                        Title: %s
                        Year Of Publication: %s
                        Author: %s %s
                        """, getTitle(), getYearOfPublication(), getAuthorFirstName(), getAuthorLastName());
    }
}

package C9_Java;

public class PrintBook extends Book{

    public PrintBook(String title, String yearOfPublication, String authorFirstName, String authorLastName, String publisher, String isbn) {
        super(title, yearOfPublication, authorFirstName, authorLastName);
        this.publisher = publisher;
        ISBN = isbn;
    }
    private final String publisher;
    private final String ISBN;

    public String getPublisher() {
        return publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("""
                publisher: %s
                ISBN: %s
                """,getPublisher(),getISBN());
    }
}

package C9_Java;

public class BookMain {
    public static void main(String[] args) {
        AudioBook audioBook = new AudioBook("Java","1998","Dietel",
                "bobo",24,30,"mike","boyo");
        System.out.println(audioBook);

        PrintBook book = new PrintBook("Java","1998","Dietel",
                "bobo","Boyo prints","EDE-45-55-012");
        System.out.println(book);

    }
}

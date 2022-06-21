package ObserverPattern;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private static int uid = 1;
    private int id;
    private String body;
    private String title;
    private LocalDateTime datePosted;

    public Post(String title, String body) {
        this.body = body;
        this.title = title;
        this.datePosted = LocalDateTime.now();
        id = uid++;
    }

    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public String getDatePosted() {
        LocalDateTime now = datePosted;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    @Override
    public String toString() {
        return String.format("""
                  postId: %d
                  date posted: %s
                  Title: %s
                  Body: %s
                """,getId(),getDatePosted(),getTitle(),getBody());
    }
}

package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer{
    public String getName() {
        return name;
    }

    private String name;
    private List<String> posts = new ArrayList<>();
    Blog blog;
    public User(Blog blog, String name) {
        this.blog = blog;
        this.name = name;
    }
    @Override
    public void update() {
        posts = blog.getCurrentPost();
    }
    public List<String> getPosts(){
        return posts;
    }
}

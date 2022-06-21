package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer{
    public String getName() {
        return name;
    }

    private String name;
    private List<Post> posts = new ArrayList<>();
    Blog blog;
    public User(Blog blog, String name) {
        this.blog = blog;
        this.name = name;
    }
    @Override
    public void update() {
        posts = blog.getCurrentPost();
    }
    public List<Post> getPosts(){
        return posts;
    }
}

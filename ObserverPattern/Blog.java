package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Observable {
    private String blogName;
    public Blog(String blogName) {
        this.blogName = blogName;
    }
    public String getName() {
        return blogName;
    }
    private List<Observer> observers = new ArrayList<>();

    private List<Post> posts = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void pushNotification() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
    public List<Post> getCurrentPost(){
        return posts;
    }
    public void addPost(Post post){
        posts.add(post);
    }

    public User getUser(String name) {
        for(Observer observer: observers){
           User user = (User) observer;
            if(user.getName().equalsIgnoreCase(name)){
                return user;
            }
        }
        throw new IllegalArgumentException("user not found");
    }
}

package phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private Map<String,User> users = new HashMap<>();
    public List<User> findALl(){
        List<User> userList = new ArrayList<>();
        users.forEach((email, user) ->{
            userList.add(user);
        } );
        return userList;
    }
    public User findByEmail(String email){
        return users.get(email);
    }
    public User addUser(User user){
        users.put(user.getEmail(),user);
        return users.get(user.getName());
    }
    public String deleteUser(String email){
        users.remove(email);
        if (!users.containsKey(email)){
            return "removed successfully";
        }
        throw new UserNotFoundException(String.format("user with id -> %s not found",email));
    }

    public void updateUser(User user) {
        users.replace(user.getEmail(),user);
    }
}

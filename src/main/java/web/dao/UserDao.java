package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);

    void updateUserById(long id, User updatedUser);

    void removeUserById(long id);

}

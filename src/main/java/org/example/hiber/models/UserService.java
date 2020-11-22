package org.example.hiber.models;

import java.util.List;

public class UserService {

    private UserDao userDao = new UserDao();

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    public void saveUser(User user) {
        userDao.save(user);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public void deleteUser(User user) {
        userDao.delete(user);
    }

    public List<User> findAllUsers() {
        return userDao.findAllUsers();
    }

    public Auto findAutoById(int id) {
        return userDao.findAutoById(id);
    }
}

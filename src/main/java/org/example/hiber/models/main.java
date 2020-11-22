package org.example.hiber.models;

public class main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user1 = new User("Magomed", 14);
        userService.saveUser(user1);
        Auto car1 = new Auto("Camry", "black");
        car1.setUser(user1);
        

    }
}

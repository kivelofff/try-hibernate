package org.example.hiber.models;

public class main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user1 = new User("Magomed", 14);
        userService.saveUser(user1);
        Auto car1 = new Auto("Camry", "black");
        car1.setUser(user1);
        user1.addAuto(car1);
        Auto car2 = new Auto("Solaris", "yellow");
        car2.setUser(user1);
        user1.addAuto(car2);
        User user2 = new User("Angella", 25);
        userService.saveUser(user2);
        Auto car3 = new Auto("Juke", "white");
        car3.setUser(user2);
        user2.addAuto(car3);
        userService.updateUser(user1);
        userService.updateUser(user2);

        System.out.println(userService.findAllUsers().toString());
    }
}

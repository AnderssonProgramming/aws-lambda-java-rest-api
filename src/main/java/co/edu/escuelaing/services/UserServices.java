package co.edu.escuelaing.services;

public class UserServices {
    public static User postUser(User user){
        user.setStatus("User " + user.getName() + " with email " + user.getEmail() + " created successfully");
        return user;
    }
}

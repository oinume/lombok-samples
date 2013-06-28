package sample;

import lombok.Data;

@Data
public class User {

    private int id;
    private String name;
    private String email;

    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("oinume");
        user.setEmail("oinume@example.com");

        System.out.println(user);
    }
}

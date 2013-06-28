package sample;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class User2 {
    @Getter
    private int id;
    @Getter
    private String name;

    public static void main(String[] args) {
        User2 user2 = new User2(1, "oinume");
        System.out.println("name = " + user2.getName());
    }
}

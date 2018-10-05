package ru.innopolis.stc13.patterns.fundamental.immutable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        Group group = new Group("stc13", "10.09.2018");
        userList.add(new User("Денчик", group));
        userList.add(new User("Денчик", group));
        userList.add(new User("Уася Пупкин", group));
        userList.add(new User("Джамшут", group));
        userList.add(new User("Равшан", group));

        group.setName("stc15");
        group.setDate("16.10.2018");

        userList.forEach(System.out::println);
    }
}

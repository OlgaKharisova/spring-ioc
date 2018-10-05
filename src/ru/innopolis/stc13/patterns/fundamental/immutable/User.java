package ru.innopolis.stc13.patterns.fundamental.immutable;

public class User {
    final private String name;
    final private Group group;

    public User(String name, Group group) {
        this.name = name;
        this.group = new Group(group.getName(), group.getDate());
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return new Group(group.getName(), group.getDate());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", group=" + group +
                '}';
    }
}

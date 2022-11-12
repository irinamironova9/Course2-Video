package livecoding1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("John", 24);
        User u2 = new User("John", 24);
        User u3 = new User("Willow", 28);
        User u4 = new User("Willow", 28);
        User u5 = new User("Jane", 28);
        User u6 = new User("Anne", 28);
        User u7 = new User("Josh", 20);
        User u8 = new User("Betty", 20);
        User u9 = new User("Jack", 35);
        User u10 = new User("Judy", 29);
        User u11 = new User("Josie", 27);

        ArrayList<User> users = new ArrayList<>();

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        users.add(u6);
        users.add(u7);
        users.add(u8);
        users.add(u9);
        users.add(u10);
        users.add(u11);

        users = sortByAgeAndName(users);
        for (User u : users) {
            System.out.println(u);
        }

        System.out.println("Самый старший - " + findOldest(users));
    }

    public static ArrayList<User> sortByAgeAndName(ArrayList<User> users) {
        Set<User> noDoubles = new HashSet<>(users);
        users.clear();
        users.addAll(noDoubles);
        users.sort(Comparator.comparing(User::getAge).thenComparing(User::getName));
        return users;
    }

    public static User findOldest(ArrayList<User> users) {
        users = sortByAgeAndName(users);
        return users.get(users.size() - 1);
    }
}
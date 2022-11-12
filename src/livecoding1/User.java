package livecoding1;

import java.util.Objects;

public class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        if (name == null || name.isBlank() || age < 0) {
            throw new IllegalArgumentException("Заполните все поля!");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Пользователь " + name +
                ", возраст - " + age + " лет.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

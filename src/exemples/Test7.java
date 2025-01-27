package exemples;

import java.util.Objects;

public class Test7 {
    String name;
    int age;

    public Test7(String n, int a) {
        this.name = n; // Инициализация поля name
        this.age = a;  // Инициализация поля age
    }
    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }


    public boolean equals(Object o) {
        if (!(o instanceof Test7 test7)) return false;
        return age == test7.age && Objects.equals(name, test7.name);
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age;
    }


}

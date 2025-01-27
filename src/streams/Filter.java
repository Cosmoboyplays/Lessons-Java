package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        Student st1 = new Student("Pasha", 3, 20);
        Student st2 = new Student("Gena", 3, 23);
        Student st3 = new Student("Kris", 5, 29);


        List<Student> al = new ArrayList<>();
        al.add(st1);
        al.add(st2);
        al.add(st3);

        al = al.stream().filter(elem -> elem.age>21 && elem.grade==4).collect(Collectors.toList());
        System.out.println(al);

    }
}

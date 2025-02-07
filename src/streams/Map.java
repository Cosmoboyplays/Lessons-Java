package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("qwerty");
        list1.add("qwertyqwerty");
        list1.add("qwertyqwertyqwerty");
        list1.add("qwertyqwertyqwertyqw");
        list1.add(5);


        List<Class<?>> list2 = list1.stream().map(elem -> elem.getClass()).collect(Collectors.toList());
        System.out.println(list2);

        Set<String> set1 = new TreeSet<>();
        set1.add("qwey");
        set1.add("qwertyqertyqwertyqw");
        set1.add("qwertyqwerty");
        set1.add("qwerty");
        System.out.println(set1);

        List<Integer> list3 = set1.stream().map(elem -> elem.length()).collect(Collectors.toList());
        System.out.println(list3);


    }
}

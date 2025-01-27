package streams;

import java.util.ArrayList;

public class foreach {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(1234);
        nums.add(0);

        nums.stream().forEach(el ->System.out.println(el));


        nums.stream().forEach(el -> Utils.myMethod(el));

    }
}

class Utils{
    public static void myMethod(int a) {
        a = a*2;
        System.out.println(a);
    }
}
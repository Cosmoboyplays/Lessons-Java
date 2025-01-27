package exemples;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(1000);
        list.add(1);
        System.out.println(list.size());

        for (int i = 0 ; i< 100 ; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.getLast());

        System.out.println(list.getClass() +"123456789");







    }
}

package exemples;

import java.util.ArrayList;
import java.util.List;

public class test9 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("one");
        l.add("two");
        l.add("three");

        String num = (String) l.get(1);
    }
}

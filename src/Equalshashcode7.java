import exemples.Test7;

import java.util.ArrayList;
import java.util.LinkedList;

public class Equalshashcode7 {
    public static void main(String[] args) {
        Test7 test7 = new Test7("Gori", 40);
        Test7 test8 = new Test7("Gori", 46);
//        test7.displayInfo();
//        test8.displayInfo();
//        System.out.println(test7.equals(test8));
//        System.out.println(test7.hashCode() == test8.hashCode());

        ArrayList<Test7> dinamList = new ArrayList<>();


//        System.out.println(dinamList.stream().count());

        dinamList.add(test7);
        dinamList.add(test8);

        Test7 fromDinamList7 = dinamList.get(0);
        Test7 fromDinamList8 = dinamList.get(1);

        ArrayList<Test7> dinamList2 = new ArrayList<>(dinamList);


//        System.out.println(fromDinamList7.toString());
//        System.out.println(dinamList.stream().count());
//        System.out.println(dinamList.equals(dinamList2));
//        System.out.println(dinamList == dinamList2);
//        System.out.println(dinamList.hashCode() + "   " + dinamList2.hashCode());


        ArrayList list = new ArrayList();
        list.add("строка");
        list.add(test7);
        list.add(1234567890);

        for (var i: list){
            System.out.println(i.getClass());
            System.out.println(i);
            System.out.println();

        }
        System.out.println(list);

        StringBuilder sb = new StringBuilder(".  ");


        LinkedList<String> lList = new LinkedList<>();
        lList.add("до");
        lList.add("ре");
        lList.add("ми");
        lList.add("фа");
        lList.add("ля");
        lList.get(3);

        System.out.println(lList.get(3));









    }
}

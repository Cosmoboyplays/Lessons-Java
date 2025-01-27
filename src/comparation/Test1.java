package comparation;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();

        Students st1 = new Students(1200, "Petr", "Smirnov", 1234);
        Students st2 = new Students(11, "Gena", "Lobkov", 4321);
        Students st3 = new Students(1000, "Vitos", "Nol", 4);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        System.out.println("До сортировки \n" + list);

        Collections.sort(list, new Namecomparator());
        System.out.println("После сортировки по именам \n" + list);

        Collections.sort(list); // Если мы применяем Collections.sort(list) то в классе Students нужно переписать метод compereTo
        System.out.println("После сортировки по id \n" + list);

        Collections.sort(list, new Salarycomparator());
        System.out.println("После сортировки по зарплатам \n" + list);





    }
}





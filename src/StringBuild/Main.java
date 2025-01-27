package StringBuild;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String[] listec = new String[3]; // неизменяем массив строк
        listec[0] = "gora";
        listec[1] = "qwerty";
        listec[2] = "poiuy";


        for (int i=0; i < listec.length; i++) {
            listec[i] = String.valueOf(listec[i].length()); //
        }


        StringBuilder sb = new StringBuilder();
        for (String i: listec){
            sb.append(i);
        }

        StringBuilder sb2 = new StringBuilder();

        // Используем стрим для добавления элементов в StringBuilder
        Arrays.stream(listec)
                .forEach(length -> sb2.append(length)); // Добавляем длины и пробелы

        // Убираем лишний пробел в конце
//        String result = sb2.toString().trim();


//        System.out.println(listec);
        System.out.println(sb);
        System.out.println(sb2);

        System.out.println(sb.toString().equals(sb2.toString()));
        System.out.println(sb.toString() == sb2.toString());
        System.out.println(sb.hashCode());
        System.out.println(sb2.hashCode());


    }
}

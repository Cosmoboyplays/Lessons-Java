package exemples;

import java.util.Arrays;


public class Test6 {
    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99};


        int [] numbersCopy = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(numbersCopy));
        String txt = "Привет Всем";
        Arrays.sort(numbers);
        System.out.println(txt + " " + Arrays.toString(numbers));
        String txtt = "Привет Всем";
        System.out.println(txtt.indexOf('е'));


        int degreeInCelcius = 35;
        String firstMethod = degreeInCelcius + ""; // конкатенация со строкой
        String secondMethod = String.valueOf(degreeInCelcius);
        String thirdMethod = Integer.toString(degreeInCelcius);
        System.out.println(firstMethod + " " + secondMethod);

    }
}

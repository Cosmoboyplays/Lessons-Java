package exemples;

import java.util.Scanner;


public class Test1 {
    public static void main(String[] args) {
        String text = text();
        System.out.println(text);
    }
    public static String text() {
        String result2;

        Scanner scanner1 = new Scanner(System.in);
        Integer input1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        Integer input2 = scanner2.nextInt();

        if (input1 > input2) {
            result2 = ("Первое" );
        }
        else if  (input1 < input2) {
            result2 = ("Второе" );
        }
        else  {
            result2 = ("Равны" );
        }
        return result2;
    }

}


//Необходимо написать метод, который принимает два числа в качестве аргументов и возвращает
//строку с информацией о том, какое число больше - первое, второе или они равны.
//
//Затем в main считать из консоли два числа от пользователя, вызвать метод с этими значениями
//и вывести результат в консоль.

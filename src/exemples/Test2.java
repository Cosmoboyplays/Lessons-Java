package exemples;

import java.util.Objects;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text());
        String role = scanner.nextLine();
        if (Objects.equals(role, "ADMIN")) { // при проверке строки нужен метод equals
            System.out.println("Здарова");
        }
        else if (Objects.equals(role, "USER"))
            System.out.println("Ты юзер");
        else
            System.out.println("Неизвестный");


    }

    public static String text() {
        String result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите два числа через пробел: ");
        String inputLine = scanner.nextLine(); // Считываем всю строку
        String[] inputs = inputLine.split(" "); // Разбиваем строку по пробелам

        // Преобразуем строки в числа
        Integer input1 = Integer.parseInt(inputs[0]);
        Integer input2 = Integer.parseInt(inputs[1]);

        if (input1 > input2) {
            result = "Первое число больше";
        } else if (input1 < input2) {
            result = "Второе число больше";
        } else {
            result = "Числа равны";
        }
        return result;
    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String input = scanner1.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) {
        boolean arabflag = false;
        boolean romflag = false;
        String[] symbols = {"+", "-", "*", "/"};
        String one;
        String two;
        String ch;
        String[] spisok = input.split("\\s+");
        String result = "";

        // обработка входа
        for (String st : spisok) { // без пробелов массив
            if (st.matches("\\d+")) {
                arabflag = true;
            } else if (st.matches("^(M{0,3})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
                romflag = true;
            } else if (Arrays.asList(symbols).contains(st)) {
                ch = st;
            } else {
                throw new IllegalArgumentException("Некорректный символ - " + st);
            }
        }

        // основная логика
        if (arabflag && romflag) {
            throw new IllegalArgumentException("Введите либо римские либо арабские" );
        } else if (spisok.length != 3) {
            throw new IllegalArgumentException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)" );
        } else if (arabflag) {
            result = String.valueOf(decision(spisok));
        } else {
            spisok[0] = String.valueOf(romanToArabic(spisok[0]));
            spisok[2] = String.valueOf(romanToArabic(spisok[2]));
            Integer resultrom = decision(spisok);

            if (resultrom < 1) {
                throw new IllegalArgumentException("Ошибка. Числа римские, результат < 1.");
            } else {
                    result = intToRoman(resultrom);
            }
        }

        return result;
    }

    // арифметические опарации
    static int decision(String[] spisok) {
        int number1 = Integer.parseInt(spisok[0]);
        int number2 = Integer.parseInt(spisok[2]);
        int result = 0;

        if (number1 > 0 && number1 <= 10 && number2 > 0 && number2 <= 10) { // 0 < number <= 10
            switch (spisok[1]) { // Проверяем арифметическое действие
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        throw new ArithmeticException("Деление на ноль");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Недопустимая операция: " + spisok[1]);
            }
        }
        else {
            throw new IllegalArgumentException("Оба числа должны быть больше 0 и меньше или равны 10");
        }

        return result;
    }

    // Метод для преобразования римских цифр в арабские
    static int romanToArabic(String roman) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);

        int total = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);   // Метод charAt(i) возвращает символ строки roman, находящийся на позиции i
            int currentValue = romanMap.get(currentChar);

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }

        return total;
    }

    // римские в арабские
    static String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();

        // Массивы значений и соответствующих римских символов
        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            // Пока число больше или равно значению, добавляем римский символ
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }
}


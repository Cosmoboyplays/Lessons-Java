import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String modifiedText = textModifier();
        System.out.println(modifiedText);
    }

    public static String textModifier() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // 1. Убираем лишние пробелы
        StringBuilder sb = new StringBuilder();
        boolean lastWasSpace = false;
        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                if (!lastWasSpace) {
                    sb.append(ch);
                    lastWasSpace = true;
                }
            } else {
                sb.append(ch);
                lastWasSpace = false;
            }
        }
        String textWithoutExtraSpaces = sb.toString();

        // 2. Обработка знаков минус и плюс
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < textWithoutExtraSpaces.length(); i++) {
            char ch = textWithoutExtraSpaces.charAt(i);
            if (ch == '-') {
                if (i > 0 && i < textWithoutExtraSpaces.length() - 1) {
                    // Меняем местами символы
                    char leftChar = result.charAt(result.length() - 1); // Символ слева от минуса
                    char rightChar = textWithoutExtraSpaces.charAt(i + 1); // Символ справа от минуса
                    result.deleteCharAt(result.length() - 1); // Удаляем последний добавленный символ
                    result.append(rightChar); // Добавляем правый символ
                    result.append(leftChar); // Добавляем левый символ
                    i++; // Пропускаем следующий символ (знак минус)
                }
            } else if (ch == '+') {
                result.append('!'); // Заменяем + на !
            } else {
                result.append(ch); // Добавляем остальные символы
            }
        }

        // 3. Подсчет суммы цифр
        int sumOfDigits = 0;
        StringBuilder result2 = new StringBuilder();
        for (char chr : result.toString().toCharArray()) {
            if (Character.isDigit(chr)) {
                // Если символ - цифра, добавляем его значение к сумме
                sumOfDigits += Character.getNumericValue(chr);
            }
            else {
                // Если не цифра, добавляем символ в результирующую строку
                result2.append(chr);
            }
        }

        // Если сумма цифр больше 0, добавляем её в конец строки
        if (sumOfDigits > 0) {
            result2.append(" ").append(sumOfDigits);
        }

        return result2.toString();
    }
}
package exemples;

import java.util.Scanner;


public class tolerance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] spisok = sc.nextLine().split("\\s+");
        double a = Double.parseDouble(spisok[0]);
        double b = Double.parseDouble(spisok[1]);
        double c = Double.parseDouble(spisok[2]);

        System.out.println(a + " " + b + " " + c);
        // Вызываем функцию с преобразованными значениями
        System.out.println(doubleExpression(a, b, c));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        double tolerance = 1E-4; // Допустимая погрешность
        return Math.abs((a + b) - c) < tolerance;
        // короче return Math.abs(a + b - c)<1E-4;
    }
}


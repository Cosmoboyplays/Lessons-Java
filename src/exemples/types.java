package exemples;

import java.util.Scanner;

public class types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(charExpression(sc.nextInt()));
    }
    public static char charExpression(int a) {
        int x = '\\'; // от символа \ на расстоянии a
        char y = (char) (x+a);
        return y;
    }
}

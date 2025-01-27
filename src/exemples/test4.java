package exemples;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String input = scanner1.nextLine();
        word(input);
    }

    public static String word(String input) {
        String[] spisok = input.split("\\s+");
        String word = spisok[0];
        int num = Integer.parseInt(spisok[1]);

        for (int i = 0; i < num; i++){
            System.out.println(word);
        }

        return word;
    }
}

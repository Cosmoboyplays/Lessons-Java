import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        float[] f = new float[]{3f, 3f, 4f, 5f, 6f}; // когда элементы явные - не нужно указывать количество просто float[]

        int[] nums = new int[5];
        Scanner sh = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sh.nextInt();

        }
        System.out.println(Arrays.toString(nums)); // Выводит массив в виде строки

        // ищем меньший в массиве
        int mini = 100000;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < mini){
                mini = nums[i];
            }
        }
        System.out.println(mini);
    }
}

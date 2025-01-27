import java.text.DecimalFormat;

public class formatfloat {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.#"); // Форматируем до одной цифры после запятой
        for (float i = 0; i < 11; i+=0.3){
            System.out.println(df.format(i)); //метод format
        }
    }
}

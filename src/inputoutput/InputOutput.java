package inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream fis = null; // вне блока try/catch чтобы видимость была
        InputStreamReader isr = null;
        try {
            fis = new FileInputStream("src/text.txt");
//            while ((b = fis.read()) != -1){
//                System.out.println((char)b);
//            }
            isr = new InputStreamReader(fis, "UTF-8");
            while ((b = isr.read()) != -1){
                System.out.println(b);
            }

        } catch (IOException e) {
           e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                isr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

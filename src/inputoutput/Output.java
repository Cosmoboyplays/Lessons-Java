package inputoutput;

import java.io.*;

public class Output {
    public static void main(String[] args) {
        String str = "\nJavaJava";
        File file = new File("src/text2.txt");
        FileWriter fr = null;

        try {
            fr = new FileWriter(file, true);
            fr.write(str); //пишем в файл
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

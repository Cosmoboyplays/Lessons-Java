package inputoutput;

import java.io.*;

public class InputOutput2 {
    public static void main(String[] args) {
        int b = 0;
        BufferedReader br = null; // вне блока try/catch чтобы видимость была
        String line;
        try {
            br = new BufferedReader(new FileReader("src/text.txt")); // для чтения построчно
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class One {
    private ABC abc;

    public void foo(){
//        int z = 1/0;
//        int[] array = {1, 2, 3};
//        array[5] = 54;

        try {
            int z = 1/0;
            abc.show();

        } catch (NullPointerException | ArithmeticException e ){
            e.printStackTrace();
            System.err.println("Шлем красное сообщение об ошибке");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Этот код выполнится полюбому");
        }
    }

    public void foo2() throws FileNotFoundException { // нужно обработать эту ошибку там, где вызывается метод
        FileInputStream fis = new FileInputStream("");
    }

}

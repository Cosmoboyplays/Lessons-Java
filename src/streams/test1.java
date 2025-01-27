package streams;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();


        System.out.println(IntStream.of(1,2,345,6,7654,37,8).average().getAsDouble());
        System.out.println(IntStream.of(1,2,345,6,7654,37,8).min().getAsInt());
        System.out.println(IntStream.of(1,2,345,6,7654,37,8).max().getAsInt());
        System.out.println(IntStream.of(1,2,345,6,7654,37,8).sum());
        System.out.println(IntStream.of(1,2,345,6,7654,37,8).summaryStatistics());


    }
}

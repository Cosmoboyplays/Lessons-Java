package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex1 {
    public static void main(String[] args) {
        MyThreadMain mtm = new MyThreadMain();
        long startTime = System.currentTimeMillis();
        mtm.run();
        long endTime = System.currentTimeMillis();
        String timemtm = "Время выполнения в одном потоке в миллисекундах: " + (endTime - startTime);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long startTime2 = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Создаем задачи
        Future<Integer> future1 = executor.submit(new MyThread1());
        Future<Integer> future2 = executor.submit(new MyThread2());
        Future<Integer> future3 = executor.submit(new MyThread3());
        Future<Integer> future4 = executor.submit(new MyThread4());

        // Получаем результаты
        try {
            int result1 = future1.get();
            int result2 = future2.get();
            int result3 = future3.get();
            int result4 = future4.get();
            long endTime2 = System.currentTimeMillis();

            System.out.println(timemtm);
            System.out.println("Результаты потоков: " + (result1+result2+result3+result4));
            System.out.println("Время выполнения в 4 потоках в миллисекундах: " + (endTime2 - startTime2));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown(); // Закрываем пул потоков
        }
    }
}


class MyThreadMain extends Thread{
    public void run() {
        sum();
    }
    private void sum(){
        int result = 0;
        for (int i=1; i<10000000; i++){ // 115-125
            //System.out.println(i);
            result += i;
        }
        //System.out.println(result);
    }
}


class MyThread1 implements Callable<Integer>{
    private Integer sum(){
        int result1 = 0;
        for (int i=1; i<2500000; i++){
            //System.out.println(i);
            result1 += i;
        }
       // System.out.println(result1);
        return result1;
    }

    @Override
    public Integer call() throws Exception {
        return sum();
    }
}


class MyThread2 implements Callable<Integer>{

    private Integer sum(){
        int result2 = 0;
        for (int i=2500000; i<5000000; i++){
            //System.out.println(i);
            result2 += i;
        }
       // System.out.println(result2);
        return result2;
    }

    @Override
    public Integer call() throws Exception {
        return sum();
    }
}


class MyThread3 implements Callable<Integer>{
    public void run() {
        sum();
    }
    private Integer sum(){
        int result3 = 0;
        for (int i=5000000; i<7500000; i++){
           // System.out.println(i);
            result3 += i;
        }
        //System.out.println(result3);
        return result3;
    }

    @Override
    public Integer call() throws Exception {
        return sum();
    }
}


class MyThread4 implements Callable<Integer>{
    private Integer sum(){
        int result4 = 0;
        for (int i=7500000; i<10000000; i++){
            //System.out.println(i);
            result4 += i;
        }
       // System.out.println(result4);
        return result4;
    }

    @Override
    public Integer call() throws Exception {
        return sum();
    }
}



package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException {
        // 1 ПОТОК
        MyThreadMain mtm = new MyThreadMain();
        long startTime = System.currentTimeMillis();
        mtm.run();
        long endTime = System.currentTimeMillis();
        String timemtm = "Время выполнения в одном потоке в миллисекундах: " + (endTime - startTime);
        Thread.sleep(3000);


        // 4 ПОТОКА
        long startTime2 = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(4); // возбудитель

        // Создаем задачи
        Future<Long> future1 = executor.submit(new MyThread1());
        Future<Long> future2 = executor.submit(new MyThread2());
        Future<Long> future3 = executor.submit(new MyThread3());
        Future<Long> future4 = executor.submit(new MyThread4());
        Future<Long> future5 = executor.submit(new MyThread5());

        // Получаем результаты
        try {
            long result1 = future1.get();
            long result2 = future2.get();
            long result3 = future3.get();
            long result4 = future4.get();
            long result5 = future5.get();
            long endTime2 = System.currentTimeMillis();

            System.out.println(timemtm);
            System.out.println("Результат 4 потоков: " + (result1+result2+result3+result4));
            System.out.println("Время выполнения в 4 потоках в миллисекундах: " + (endTime2 - startTime2));
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown(); // Закрываем пул потоков
        }
    }
}

// это 1 поток
class MyThreadMain extends Thread{
    public void run() {
        long result = 0;
        long z = 0;
        for (long i=1; i<1_000_000_000; i++){ // 115-125
            //System.out.println(i);
            z = (long) Math.sqrt(i * i);
            result += z;
        }
        System.out.println("Результат одного потока "+result);
    }
//    private void sum(){
//        long result = 0;
//        long z = 0;
//        for (long i=1; i<1_000_000_000; i++){ // 115-125
//            //System.out.println(i);
//            z = (long) Math.sqrt(i * i);
//            result += z;
//        }
//        System.out.println("Результат одного потока "+result);
//    }
}

// 4 потока
class MyThread1 implements Callable<Long> {
    private Long sum(){
        long result1 = 0;
        long z = 0;
        for (long i=1; i<250_000_000; i++){
            z = (long) Math.sqrt(i * i);
            result1 += z;
        }
        return result1;
    }

    @Override
    public Long call() {
        return sum();
    }
}


class MyThread2 implements Callable<Long>{

    private Long sum(){
        long result2 = 0;
        long z = 0;
        for (long i=250_000_000; i<500_000_000; i++){
            z = (long) Math.sqrt(i * i);
            result2 += z;
        }
        return result2;
    }

    @Override
    public Long call() throws Exception {
        return sum();
    }
}


class MyThread3 implements Callable<Long>{
    public void run() {
        sum();
    }
    private long sum(){
        long result3 = 0;
        long z = 0;
        for (long i=500_000_000; i<750_000_000; i++){
            z = (long) Math.sqrt(i * i);
            result3 += z;
        }
        return result3;
    }

    @Override
    public Long call() throws Exception {
        return sum();
    }
}


class MyThread4 implements Callable<Long> {
    private long sum() {
        long result4 = 0;
        long z = 0;
        for (long i = 750_000_000; i < 1_000_000_000; i++) {
            z = (long) Math.sqrt(i * i);
            result4 += z;
        }
        return result4;
    }

    @Override
    public Long call() throws Exception {
        return sum();
    }
}

class MyThread5 implements Callable<Long> {
        private long sum() {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            long result4 = 12345;
            System.out.println("Я ничего из 5 потока");
            return result4;
        }

        @Override
        public Long call() throws Exception {
            return sum();
        }
    }



package multithreading;

public class Ex2 {
    public static void main(String[] args) {
        MyThread11 Thread11 = new MyThread11(); // сохзраняем ссылку на обхъект, чтобы потом смогли его вызвать

        Thread one = new Thread(Thread11); // передаем ссылку
        one.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread11.getResult4());



    }
}

class MyThread11 implements Runnable { //нужно имплементироваться
    long result4 = 0;
    public void run() {
        long result4 = 0;
        long z = 0;
        for (long i = 750_000_000; i < 1_000_000_000; i++) {
            z = (long) Math.sqrt(i * i);
            this.result4 += z;
        }
        System.out.println("Я Thread11");
//        return result4;
    }

    public long getResult4() {
        return result4;
    }

    public void setResult4(long result4) {
        this.result4 = result4;
    }
}
package multithreading;

public class Ex7 {
    public static void main(String[] args) throws InterruptedException {
        MyThread11 Thread11 = new MyThread11(); // сохраняем ссылку на объект, чтобы потом смогли его вызвать

        Thread one = new Thread(Thread11); // передаем ссылку
        one.start();
        one.join(1500); // ждем окончания потока и тогда main продолжит свою работу
        // можно передать сколько времени будет ждать поток
        System.out.println(one.getState());// получаем состояние потока
        System.out.println(Thread11.getResult4());

    }
}

class MyThread22 implements Runnable { //нужно имплементировать
    long result4 = 0;

    @Override
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
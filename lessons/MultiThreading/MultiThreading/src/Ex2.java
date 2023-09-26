public class Ex2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread3());
        Thread thread2 = new Thread(new Thread4());
        thread1.start();
        thread2.start();
    }
}


class Thread3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class Thread4 implements Runnable{
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
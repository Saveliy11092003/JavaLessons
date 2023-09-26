public class Ex6 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());
        System.out.println("Main ends");
    }
}

class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("Worker starts");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Worker ends");
    }
}
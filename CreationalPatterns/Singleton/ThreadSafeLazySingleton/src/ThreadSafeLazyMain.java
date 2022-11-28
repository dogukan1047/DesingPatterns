public class ThreadSafeLazyMain  extends Thread{
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new ThreadSafeLazyMain().start();
        }
    }

    public void run() {
        ThreadSafeLazySingletonC ls = ThreadSafeLazySingletonC.getInstance();
        ls.printName();
    }
    }

public class ThreadliLazySingletonMain extends Thread {

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            new ThreadliLazySingletonMain().start();
        }
    }

    public void run() {
        LazySingleton ls = LazySingleton.getInstance();
        ls.printName();
    }
}


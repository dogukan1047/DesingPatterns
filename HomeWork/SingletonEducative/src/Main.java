public class Main extends Thread {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Main().start();// Thread Start
        }

    }
    public  void run() {
        SingletonA ls = SingletonA.getInstance();
        ls.printName();
    }
}
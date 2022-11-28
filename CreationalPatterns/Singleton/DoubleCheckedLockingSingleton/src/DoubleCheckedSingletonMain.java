public class DoubleCheckedSingletonMain extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new DoubleCheckedSingletonMain().start();// Thread Start
        }
    }

    public void run() {
         DoubleCheckedLockingSingleton1 ls = DoubleCheckedLockingSingleton1.getInstance();
        ls.printName();
    }
    }

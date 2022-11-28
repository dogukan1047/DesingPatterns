public class ThreadSafeLazySingletonC {

    private static ThreadSafeLazySingletonC threadSafeLazySingletonC;
    private static int count;
    private String name;

    private ThreadSafeLazySingletonC() {
        name = "ThreadSafeLazySingleton" + count;
        count++;
    }

    ;

    public static ThreadSafeLazySingletonC getInstance() {
        synchronized (ThreadSafeLazySingletonC.class) {
            if (threadSafeLazySingletonC == null)
                threadSafeLazySingletonC = new ThreadSafeLazySingletonC();
        }

        return threadSafeLazySingletonC;
    }

    public void printName() {
        System.out.println(name);
    }

}

public class LazySingleton {

    private static LazySingleton singleton;

    private static int count;
    private String name;

    private LazySingleton() {
        count++;
        name = "LazySingleton" + count;
    }

    public static LazySingleton getInstance() {
        if (singleton == null)
            singleton = new LazySingleton();// buradaki temel sorunu çözdük ancak threadli sistemlerde birden fazla nesne üretti
        return singleton;
    }

    public void printName() {
        System.out.println(name);
    }
}

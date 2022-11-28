public class DoubleCheckedLockingSingleton1 {
    //	private static DoubleCheckedLockingSingleton singleton;
    private static volatile DoubleCheckedLockingSingleton1 singleton;

    private static int count;
    private String name;

    private DoubleCheckedLockingSingleton1() {
        name = "DoubleCheckedLockingSingleton" + count;
        count++;
    }

    public static DoubleCheckedLockingSingleton1 getInstance() {
        // Unsynchronized null check is faster.
        if (singleton == null) {
            // Less synchronized area is better.
            synchronized (DoubleCheckedLockingSingleton1.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckedLockingSingleton1();
                }
            }
        }
        return singleton;
    }

    public void printName() {
        System.out.println(name);
    }
}


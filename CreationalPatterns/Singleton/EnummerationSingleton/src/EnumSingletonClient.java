public class EnumSingletonClient {

    public static void main(String[] args) {
        EnumSingleton instance1 = EnumSingleton.SINGLETON;
        EnumSingleton instance2 = EnumSingleton.getInstance();

        if(instance1 == instance2)
            System.out.println("The same!");
        else
            System.out.println("Different!");

    }
}

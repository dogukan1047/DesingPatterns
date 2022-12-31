public class SingletonA {

    private static volatile SingletonA singletonA;
    private static int count;
    private String name;
    private SingletonA() {
        name = "SingletonA" + count;
        count++;
    }

    public static SingletonA getInstance(){
        if (singletonA==null){
            //...
            synchronized (SingletonA.class){
                if (singletonA==null){

                    singletonA= new SingletonA();
                }
            }



        }





        return singletonA;
    }
    public void printName() {
        System.out.println(name);
    }
}

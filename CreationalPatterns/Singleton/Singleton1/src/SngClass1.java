
public class SngClass1 {

    private static SngClass1 sngClass1 = new SngClass1();//burada oluştu static olarak
    private static int count;
    private String name;

    private SngClass1() {//dışardan yeni bir nesne oluşturmaya kapattık
        count++;
        name = "Singleton" + count;
    }

    public static SngClass1 getInstance() {

        return sngClass1;
    }

    public void printName() {
        System.out.println(name);
    }

}

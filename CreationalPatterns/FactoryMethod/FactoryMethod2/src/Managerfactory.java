public class Managerfactory implements Factory{
    @Override
    public Employee create(String name) {
        Manager manager=new Manager(1,name,18,"Software","Software");
        return manager;
    }
}

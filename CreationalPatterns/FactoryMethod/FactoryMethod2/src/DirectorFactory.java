public class DirectorFactory implements Factory{
    @Override
    public Employee create(String name) {
        Director director=new Director(2,name,20,"Software","Software",5000);
        return null;
    }
}

public class EmployeeFactory implements Factory{


    @Override
    public Employee create(String name) {
        Employee employee=new Employee(3,name,25,"Software");
        return null;
    }
}

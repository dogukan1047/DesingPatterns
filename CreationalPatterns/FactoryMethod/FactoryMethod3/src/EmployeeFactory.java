import java.util.Random;

public class EmployeeFactory {
static Random random=new Random();
    public static Employee createEmployee(String name) {
        Employee employee = null;
        int id = random.nextInt(10);
        int year =random.nextInt(40);
        String department ="Software";
        employee = new Employee(id, name, year, department);
        return employee;
    }

    public static Manager createManager(String name, String department) {
        Manager manager = null;
        int id = random.nextInt(10);
        int year = random.nextInt(40);
        manager = new Manager(id, name, year, department, department);
        return manager;
    }

    public static Director createDirector(String name, String department, int bonus) {
        Director director = null;
        int id = random.nextInt(40);
        int year = random.nextInt(40);
        director = new Director(id, name, year, "Management", "Management", 5000);
        return director;
    }
}
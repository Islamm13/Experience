package lesson7;

public class Employee {

    long id;

    String name;

    int workYear;

    String department;

    public static final int BASE_SALARY =700;

    public Employee(long id, String name, int workYear, String department) {
        this.id = id;
        this.name = name;
        this.workYear = workYear;
        this.department = department;
    }

    public void work(){
        System.out.println("Employee is working!");
    }

    public double calculateSalary(){
        return workYear * BASE_SALARY;
    }

    public static int getBaseSalary(){
        return BASE_SALARY;
    }

    public void printInfo(){
        System.out.println("No:"+id);
        System.out.println("Name:"+name);
        System.out.println("Year:"+workYear);
        System.out.println("Department:"+department);
    }
}

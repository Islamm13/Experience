package lesson7;

public class Manager extends Employee {

    String departmentManeged;

    public static final int MANAGEMENT_PAYMENT = 4000;

    public Manager(long id, String name, int workYear, String department, String departmentManeged) {
        super(id, name, workYear, department);
        this.departmentManeged = departmentManeged;
    }

    @Override
    public void work() {
        System.out.println("MANAGER is working!");
        manage();
    }
    public void manage(){
        System.out.println("Manager manages department"+departmentManeged);
    }

    @Override
    public double calculateSalary() {
        return workYear * BASE_SALARY + MANAGEMENT_PAYMENT;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Managing Department:"+departmentManeged);
    }
}

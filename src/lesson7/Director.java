package lesson7;

public class Director extends Manager{

    double bonus;

    public Director(long id, String name, int workYear, String department, String departmentManeged, double bonus) {
        super(id, name, workYear, department, departmentManeged);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("Director is working!");
        manage();
    }

    @Override
    public void manage() {
        System.out.println("Director manages whole company");
        makeStrategicPlan();
    }

    public void makeStrategicPlan(){
        System.out.println("Director make a strategic plan for the company");
    }

    @Override
    public double calculateSalary() {
        return workYear * BASE_SALARY + MANAGEMENT_PAYMENT + bonus;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Special bonus:"+bonus);
    }
}

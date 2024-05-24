import lesson7.*;

public class Main {
    public static void main(String[] args) {


        Employee vasif = new Employee(1, "Islam", 4, "Programmer");
        System.out.println("Salary" + vasif.calculateSalary());
        vasif.printInfo();
        System.out.println("____________________________");


        Manager nazim = new Manager(2, "Nazim", 7, "Programmer",
                "Programmer");
        System.out.println("Salary" + nazim.calculateSalary());
        nazim.printInfo();
        System.out.println("_____________________________");


        Director tofiq = new Director(3,"Tofiq",9,
                "Prog","Whole Company",9000);
        System.out.println("Salary"+tofiq.calculateSalary());
        tofiq.printInfo();

    }
}
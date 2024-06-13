package lesson13.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Universty {

    private String name;

    private String numberOfStudent;

    private List<Department> departments;

    public Universty(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(String numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public void addDepartment(Department department){
        departments.add(department);
    }
    public void removeDepartment(Department department){
        departments.remove(department);
    }
public void displayDepartments(){
    System.out.println("Departmens in"+ name+":");
    for (Department department : departments){
        System.out.println(department.getName());
    }
}

    @Override
    public String toString() {
        return "Universty{name='%s', numberOfStudent='%s'}".formatted(name, numberOfStudent);
    }
}

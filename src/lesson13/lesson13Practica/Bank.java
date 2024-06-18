package lesson13.lesson13Practica;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private Long id;
    private String name;
    private List<BankBranch> bankBranch;
    private List<Lesson13.Employee> employees;
    private List<Atm> atms;

    public Bank(Long id, String name) {
        this.id = id;
        this.name = name;
        this.bankBranch=new ArrayList<>();
        this.employees=new ArrayList<>();
        this.atms=new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}

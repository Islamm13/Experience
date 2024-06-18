package lesson13.lesson13Practica;

import java.util.ArrayList;
import java.util.List;

public class AtmWithdrawEmployees {
    private Long id;
    private Atm atms;
    private List<Lesson13.Employee> employee;

    public AtmWithdrawEmployees(Long id, Atm atms) {
        this.id = id;
        this.atms = atms;
        this.employee=new ArrayList<>();
    }
}

package lesson13.lesson13Practica;

import java.util.List;

public class CustomerBank {
    private Long id;
    List<Customer> customers;
    List<Bank> banks;


    public CustomerBank(Long id, List<Customer> customers, List<Bank> banks) {
        this.id = id;
        this.customers = customers;
        this.banks = banks;
    }
}

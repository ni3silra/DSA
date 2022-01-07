package com.lowleveldesign.employee.entities.main;

import com.lowleveldesign.employee.entities.*;

import java.util.*;

public class Client {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        List<Tax> taxes = new ArrayList<>(Arrays.asList(new ProfessionalTax(20),new EducationCessTax(3)));

        for (int i = 0; i < 10; i++) {
            Employee employee = new FullTimeEmployee();

            employee.setBaseSalary(new Random().nextInt(10000) + 10000);
            employee.setTaxes(taxes);

            generateInHandSalary(employee);

            employees.add(employee);
        }
        System.out.println(employees);
    }

    private static void generateInHandSalary(Employee employee) {
        float totalTax = 0;
        for(Tax tax : employee.getTaxes()){
            totalTax+=calculateTax(employee.getBaseSalary(),tax.getTaxRate());
        }
        employee.setInHandSalary((long) (employee.getBaseSalary() - totalTax));
    }

    private static float calculateTax(long salary,float tax){
        return salary * tax/100;
    }

}

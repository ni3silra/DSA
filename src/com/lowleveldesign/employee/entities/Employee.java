package com.lowleveldesign.employee.entities;

import java.util.List;

public class Employee {
    long baseSalary;
    List<Tax> taxes;
    long inHandSalary;

    public long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(long baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<Tax> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    public long getInHandSalary() {
        return inHandSalary;
    }

    public void setInHandSalary(long inHandSalary) {
        this.inHandSalary = inHandSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "baseSalary=" + baseSalary +
                ", taxes=" + taxes +
                ", inHandSalary=" + inHandSalary +
                '}';
    }
}

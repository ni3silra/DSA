package com.lowleveldesign.employee.entities;

public class FullTimeEmployee extends Employee{
    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "baseSalary=" + baseSalary +
                ", taxes=" + taxes +
                ", inHandSalary=" + inHandSalary +
                '}';
    }
}

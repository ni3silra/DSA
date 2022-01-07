package com.lowleveldesign.employee.entities;

public class EducationCessTax extends Tax{
    public EducationCessTax(float taxRate) {
        super(taxRate);
    }

    @Override
    public String toString() {
        return "EducationCessTax{" +
                "taxRate=" + taxRate +
                '}';
    }
}

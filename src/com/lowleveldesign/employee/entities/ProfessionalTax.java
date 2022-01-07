package com.lowleveldesign.employee.entities;

public class ProfessionalTax extends Tax {
    public ProfessionalTax(float taxRate) {
        super(taxRate);
    }

    @Override
    public String toString() {
        return "ProfessionalTax{" +
                "taxRate=" + taxRate +
                '}';
    }
}

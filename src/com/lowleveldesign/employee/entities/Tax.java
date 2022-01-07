package com.lowleveldesign.employee.entities;

public class Tax {
    float taxRate;

    public Tax(float taxRate){
        this.taxRate = taxRate;
    }

    public float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(float taxRate) {
        this.taxRate = taxRate;
    }
}

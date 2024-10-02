package com.mcaa;

import javax.persistence.*;

@Entity
@IdClass(EconomicFactorsId.class) // Use composite key
public class EconomicFactors {
    
    @Id
    private int month; 

    @Id
    private int year;  

    private double interestRate;

    private double unemploymentRate;

    private int availableFinanceOptions;


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getUnemploymentRate() {
        return unemploymentRate;
    }

    public void setUnemploymentRate(double unemploymentRate) {
        this.unemploymentRate = unemploymentRate;
    }

    public int getAvailableFinanceOptions() {
        return availableFinanceOptions;
    }

    public void setAvailableFinanceOptions(int availableFinanceOptions) {
        this.availableFinanceOptions = availableFinanceOptions;
    }
}

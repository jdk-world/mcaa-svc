package com.mcaa;

import java.io.Serializable;
import java.util.Objects;

public class EconomicFactorsId implements Serializable {
    private int month;
    private int year;

    public EconomicFactorsId() {}

    public EconomicFactorsId(int month, int year) {
        this.month = month;
        this.year = year;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EconomicFactorsId)) return false;
        EconomicFactorsId that = (EconomicFactorsId) o;
        return month == that.month && year == that.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, year);
    }
}

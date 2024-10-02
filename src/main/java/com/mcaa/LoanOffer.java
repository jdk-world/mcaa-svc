package com.mcaa;

public class LoanOffer {
    private String bankName;
    private double interestRate;
    private int repaymentPeriod;
    private double amount;
    private String eligibilityCriteria;
    private String loanType;
    private int id;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Constructor
    public LoanOffer(int id, String bankName, double interestRate, int repaymentPeriod, double amount, String eligibilityCriteria, String loanType) {
        this.bankName = bankName;
        this.interestRate = interestRate;
        this.repaymentPeriod = repaymentPeriod;
        this.amount = amount;
        this.eligibilityCriteria = eligibilityCriteria;
        this.loanType = loanType;
        this.id = id;
    }

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getRepaymentPeriod() {
		return repaymentPeriod;
	}

	public void setRepaymentPeriod(int repaymentPeriod) {
		this.repaymentPeriod = repaymentPeriod;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getEligibilityCriteria() {
		return eligibilityCriteria;
	}

	public void setEligibilityCriteria(String eligibilityCriteria) {
		this.eligibilityCriteria = eligibilityCriteria;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

    // Getters and Setters
    // (Make sure you have getters like getBankName(), getInterestRate(), etc.)
}

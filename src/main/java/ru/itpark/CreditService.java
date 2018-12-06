package ru.itpark;

public class CreditService {
    public double calculateCredit(int creditAmount, double interestRate , int creditPeriodMonth) {
        int monthInYear = 12;
        int constant = 1;
        double monthlyInterestRate = (interestRate /monthInYear) / 100;
        double intermediateValue = Math.pow((constant + monthlyInterestRate),creditPeriodMonth);
        double annuityRatio = (monthlyInterestRate*intermediateValue)/(intermediateValue - constant);
        double monthlyPayment = annuityRatio * creditAmount;
        double result = Math.round(monthlyPayment * creditPeriodMonth);
        return result;
    }
}
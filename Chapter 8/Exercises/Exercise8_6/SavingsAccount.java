package Exercise8_6;

public class SavingsAccount {
    public static double annualInterestRate; //to store the annual interest rate for all account holders
    private double savingsBalance; //to indicate amount of saver currently has on deposit

    SavingsAccount(){
        annualInterestRate = 0;
        savingsBalance = 0;
    }
    SavingsAccount(double newAnnualInterestRate, double savingsBalance){
        this.savingsBalance = savingsBalance;
        annualInterestRate = newAnnualInterestRate;
    }
    SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
        annualInterestRate = 10.0; //default arbitrary value that i chose
    }


    public void calculateMonthlyInterest(){
        savingsBalance+=savingsBalance*((annualInterestRate/100)/12);
    }
    public static void modifyInterestRate(double newAnnualInterestRate){
        setAnnualInterestRate(newAnnualInterestRate);
    }




    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
    public void setSavingsBalance(double savingsBalance) {this.savingsBalance = savingsBalance;}

    public static double getAnnualInterestRate() {return annualInterestRate;}
    public double getSavingsBalance() {return savingsBalance;}
}

package Exercise3_12; // Package declaration for organizing this class file


/*
* Modify class Account (Fig. 3.13) to provide a method called debit that withdraws money from an Account. Ensure that the debit amount does not exceed the
Account’s balance. If it does, the balance should be left unchanged and the method should print a
message indicating "Debit amount exceeded account balance." Modify class AccountTest
(Fig. 3.14) to test method debit.
*
* */

public class Account {//Access modifier: public. Class name: Account. Beginning of class Account's body

    // Declaration of private instance variable (Implementation of information hiding)
    private double balance;

    // Constructor with "double" parameter initialBalance that sets balance for this account
    public Account(double initialBalance){// Beginning of Constructor body

        // If statement: checks if the initial balance provided is positive
        if(initialBalance > 0.0){ // Beginning of if's body
            this.balance = initialBalance; // Assignment statement: initialize the instance variable 'balance'
        }//End of if's body
    }//End of Constructor body


    // Method credit: adds amount from the parameter provided by argument of caller of this method to this balance of object
    public void credit(double amount){
        balance += amount; // Adds the positive 'amount' to the current 'balance'
    }


    // Method debit: subtracts amount from the parameter provided by argument of caller of this method from this balance of object
    public void debit(double amount){// Beginning of method's body
        // If statement with block of code: checks if the withdrawal 'amount' is greater than the current 'balance'
        if(amount > this.balance){
            // If the amount is too high, print an error message
            System.out.println("Debit amount exceeded account balance.");
        }else { // Else statement: executed if the withdrawal amount is valid (less than or equal to balance)
            this.balance -= amount; // Subtract the 'amount' from the 'balance'
        }
    }// End of method's body

    // Getter for balance: returns the current balance of the account
    public double getBalance(){
        return this.balance; // Return the value of the instance variable 'balance'
    }
} //End of class Account's body
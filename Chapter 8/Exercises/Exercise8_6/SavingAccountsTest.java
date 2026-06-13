package Exercise8_6;

public class SavingAccountsTest {
    public static void main(String[] args){
        SavingsAccount account1 = new SavingsAccount(2000.00);
        SavingsAccount account2 = new SavingsAccount(3000.00);
        SavingsAccount.setAnnualInterestRate(4);

        System.out.println("---------------------------------------------------------");
        System.out.println("Interest rate: 4%");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s | %18s | %18s\n", "Month", "Account 1 Balance", "Account 2 Balance");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < 12; i++) {
            account1.calculateMonthlyInterest();
            account2.calculateMonthlyInterest();
            String monthLabel = "Month " + (i + 1);
            System.out.printf("%-10s | $%17.2f | $%17.2f\n",
                    monthLabel,
                    account1.getSavingsBalance(),
                    account2.getSavingsBalance());
        }

        SavingsAccount.setAnnualInterestRate(5);
        account1.setSavingsBalance(2000);
        account2.setSavingsBalance(3000);

        System.out.println("---------------------------------------------------------");
        System.out.println("Interest rate: 5%");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s | %18s | %18s\n", "Month", "Account 1 Balance", "Account 2 Balance");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < 12; i++) {
            account1.calculateMonthlyInterest();
            account2.calculateMonthlyInterest();
            String monthLabel = "Month " + (i + 1);
            System.out.printf("%-10s | $%17.2f | $%17.2f\n",
                    monthLabel,
                    account1.getSavingsBalance(),
                    account2.getSavingsBalance());
        }
    }
}

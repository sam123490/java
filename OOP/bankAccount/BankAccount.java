public class BankAccount {
    private double checkingBalance;
    private double savingBalance;
    private static int numOfAccounts;
    private static float totalMoney;

    public BankAccount() {
        this.checkingBalance = 0.0;
        this.savingBalance = 0.0;
        numOfAccounts++;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingBalance() {
        return this.savingBalance;
    }

    public void depositMoney(String accountType, double amount) {
        if (accountType == "checking") {
            this.checkingBalance += amount;
            totalMoney += amount;
        }
        else if (accountType == "saving") {
            this.savingBalance += amount;
            totalMoney += amount;
        }
    }

    public void withdrawMoney(String accountType, double amount) {
        if (accountType == "checking" && this.checkingBalance >= amount) {
            this.checkingBalance -= amount;
            totalMoney -= amount;
        }
        else if (accountType == "saving" && this.savingBalance >= amount) {
            this.savingBalance -= amount;
            totalMoney -= amount;
        }
    }
    public void displayAccounts() {
        System.out.println("Checking Balance: $" + this.checkingBalance);
        System.out.println("Saving Balance: $" + this.savingBalance);
    }
}
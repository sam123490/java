public class BankAccount {
    private double checkingBalance;
    private double savingBalance;
    private static int numOfAccounts;
    private static double totalMoney;

    public BankAccount() {
        this(0.0, 0.0);
    }
    public BankAccount(double checkBalance, double savBalance) {
        this.checkingBalance = checkBalance;
        this.savingBalance = savBalance;
        totalMoney += (checkBalance = savBalance);
        numOfAccounts++;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingBalance() {
        return savingBalance;
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
        else {
            System.out.println("Deposit to either checking or saving account.");
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
        else {
            System.out.println("Insufficient funds.");
        }
    }
    public void displayAccounts() {
        System.out.println("Checking Balance: $" + this.checkingBalance);
        System.out.println("Saving Balance: $" + this.savingBalance);
    }

    // static methods for static member variables
    public static void getNumOfAccounts() {
        System.out.println("Number of Accounts: " + numOfAccounts);
    }
    public static void getTotalMoney() {
        System.out.println("Total money: $" + totalMoney);
    }

}
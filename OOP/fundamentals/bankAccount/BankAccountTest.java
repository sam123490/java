public class BankAccountTest {
    public static void main(String[] args){
        BankAccount Account1 = new BankAccount();
        BankAccount Account2 = new BankAccount(450.0, 200.0);

        // Testing class methods
        Account1.depositMoney("saving", 50.0);
        System.out.println(Account1.getCheckingBalance());
        System.out.println(Account1.getSavingBalance());

        Account2.withdrawMoney("checking", 175.50);
        Account2.withdrawMoney("checking", 600.0);
        Account2.displayAccounts();
    }
}
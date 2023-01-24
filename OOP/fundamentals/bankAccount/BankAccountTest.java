public class BankAccountTest {
    public static void main(String[] args){
        BankAccount Account1 = new BankAccount();
        BankAccount Account2 = new BankAccount(400, 200);
        BankAccount.getNumOfAccounts();

        // Testing class methods
        Account1.depositMoney("saving", 50);
        Account1.withdrawMoney("saving", 100);
        System.out.println(Account1.getCheckingBalance());
        System.out.println(Account1.getSavingBalance());
        
        Account2.withdrawMoney("checking", 200);
        Account2.depositMoney("checking", 250);
        Account2.withdrawMoney("saving", 600);
        Account2.displayAccounts();

        BankAccount.getTotalMoney();
    }
}
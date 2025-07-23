class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class TestAcc {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountNumber("12345678");
        account.setBalance(5436.72);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance       : INR " + account.getBalance());
    }
}

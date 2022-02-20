package entities;

public class BankAccount {

    private int numberAccount;
    private String nameAccount;
    private double balance;

    public BankAccount(int numberAccount, String nameAccount) {
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
    }

    public BankAccount(int numberAccount, String nameAccount, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        deposit(initialDeposit);
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
        this.balance -= balance + 5.0;
    }

    public String toString() {
        return "O número da conta é "
                + numberAccount + " do proprietário: "
                + nameAccount
                +", Saldo de: $"
                +String.format("%.2f", balance);
    }
}

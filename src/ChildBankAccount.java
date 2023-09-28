public class ChildBankAccount {
    private  double balance = 0;
    private double maxBalance = 0;
    private double sum = 0;

    public ChildBankAccount(double maxBalance) {
        this.maxBalance = maxBalance;
    }

    public boolean depositMoney(double value) {
        sum = balance + value;
        if (sum < maxBalance && value > 0) {
            balance = balance + value;
        }
        return false;
    }

    public boolean debitMoney(double value) {
        sum = balance - value;
        if (sum > 0 && value > 0) {
            balance = balance - value;
            return true;
        }
        return false;

    }
    public double getBalance() {
        return balance;
    }
}

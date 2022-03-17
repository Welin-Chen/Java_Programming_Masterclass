import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposit. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int amount) {
        int withdraw = -amount;
        if (withdraw < 0) {
            transactions.add(withdraw);
            this.balance += withdraw;
            System.out.println(amount + " withdraw. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void caculateBalance() {
        this.balance = 0;
        for (int i : transactions) {
            this.balance += i;
        }
        System.out.println("Caculated balances " + this.balance);
    }
}

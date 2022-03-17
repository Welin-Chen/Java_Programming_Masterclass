public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account() {
        this("Default number", 2.5, "default name", "default email", "default phone");
        System.out.println("Empty constuctor called");
    }

    public Account(String accountNumber, double balance, String name, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void printAccount() {
        System.out.println();
        System.out.println("accountNumber = " + this.accountNumber);
        System.out.println("balance = " + this.balance);
        System.out.println("name = " + this.name);
        System.out.println("email = " + this.email);
        System.out.println("phoneNumber = " + this.phoneNumber);
        System.out.println();
    }

    public void Deposit(int deposit) {
        this.balance += deposit;
        System.out.println("after Deposit " + deposit + ", and balance = " + this.balance);
    }

    public void Withdraw(int withdraw) {
        if (withdraw > this.balance) {
            System.out.println("withdraw " + withdraw + ", and Insufficient fund to be withdrawed");
        } else {
            this.balance -= withdraw;
            System.out.println("after withdraw " + withdraw + ", and balance = " + this.balance);
        }
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getBalnce() {
        return this.balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}

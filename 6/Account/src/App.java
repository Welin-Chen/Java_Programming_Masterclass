public class App {
    public static void main(String[] args) throws Exception {
        // Account account = new Account("12345", 1000, "Welin",
        // "a0929015591@gmail.com", "0929015591");
        // Account account = new Account();

        // account.printAccount();

        // account.Deposit(1000);
        // account.Withdraw(500);
        // account.Withdraw(2000);

        // account.printAccount();

        VipCustomer account = new VipCustomer();
        System.out.println("VipCustomer name : " + account.getName());
        System.out.println("VipCustomer credit limit : " + account.getCreditLimit());
        System.out.println("VipCustomer email : " + account.getEmail());
        System.out.println();

        VipCustomer account2 = new VipCustomer("Welin", 10000);
        System.out.println("VipCustomer name : " + account2.getName());
        System.out.println("VipCustomer credit limit : " + account2.getCreditLimit());
        System.out.println("VipCustomer email : " + account2.getEmail());
        System.out.println();

        VipCustomer account3 = new VipCustomer("Welin Chen", 20000, "aaa@gmail.com");
        System.out.println("VipCustomer name : " + account3.getName());
        System.out.println("VipCustomer credit limit : " + account3.getCreditLimit());
        System.out.println("VipCustomer email : " + account3.getEmail());
        System.out.println();
    }
}

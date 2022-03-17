public class App {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 42.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.listCustomers("Sydney", true);

        if (!bank.addCustomer("Melbourne", "Brian", 5.53))
            ;
        {
            System.out.println("Error Melbourne branch doesn't exist");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if (!bank.addCustomer("Adelaide", "Fegrus", 52.3)) {
            System.out.println("Customer doesn't exist in the branch");
        }

        if (!bank.addCustomer("Adelaide", "Time", 10.5)) {
            System.out.println("Customer Time already exists");
        }
    }
}

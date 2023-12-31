import com.xiaoma.banking.*;

import java.text.NumberFormat;

/**
 * ClassName: TestBanking05_1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/7 18:02
 * @Version 1.0
 */
public class TestBanking05_1 {public static void main(String[] args) {
    NumberFormat currency_format = NumberFormat.getCurrencyInstance();
    Bank bank = new Bank();
    Customer customer;

    // Create several customers and their accounts
    bank.addCustomer("Jane", "Simms");
    customer = bank.getCustomer(0);
    customer.addAccount(new SavingAccount(500.00, 0.05));
    customer.addAccount(new CheckingAccount(200.00, 400.00));

    bank.addCustomer("Owen", "Bryant");
    customer = bank.getCustomer(1);
    customer.addAccount(new CheckingAccount(200.00));

    bank.addCustomer("Tim", "Soley");
    customer = bank.getCustomer(2);
    customer.addAccount(new SavingAccount(1500.00, 0.05));
    customer.addAccount(new CheckingAccount(200.00));

    bank.addCustomer("Maria", "Soley");
    customer = bank.getCustomer(3);
    // Maria and Tim have a shared checking account
    customer.addAccount(bank.getCustomer(2).getAccount(1));
    customer.addAccount(new SavingAccount(150.00, 0.05));

    // Generate a report
    System.out.println("\t\t\tCUSTOMERS REPORT");
    System.out.println("\t\t\t================");

    for ( int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++ ) {
        customer = bank.getCustomer(cust_idx);

        System.out.println();
        System.out.println("Customer: "
                + customer.getLastName() + ", "
                + customer.getFirstName());

        for ( int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++ ) {
            Account account = customer.getAccount(acct_idx);
            String  account_type = "";

            // Determine the account type
            /*** Step 1:
             **** Use the instanceof operator to test what type of account
             **** we have and set account_type to an appropriate value, such
             **** as "Savings Account" or "Checking Account".
             ***/

            // Print the current balance of the account
            /*** Step 2:
             **** Print out the type of account and the balance.
             **** Feel free to use the currency_format formatter
             **** to generate a "currency string" for the balance.
             ***/
        }
    }
}
}

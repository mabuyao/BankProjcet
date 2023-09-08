import com.xiaoma.banking.Bank;
import com.xiaoma.banking.Customer;

/**
 * ClassName: TestBanking04
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/7 17:27
 * @Version 1.0
 */
public class TestBanking04 {  public static void main(String[] args) {
    Bank bank = new Bank();

    // Add Customer Jane, Simms
    bank.addCustomer("Jane","Smith");

    //Add Customer Owen, Bryant
    bank.addCustomer("Owen","Bryant");

    // Add Customer Tim, Soley
    bank.addCustomer("Tim","Soley");

    // Add Customer Maria, Soley
    bank.addCustomer("Maria","Soley");

    for ( int i = 0; i < bank.getNumOfCustomers(); i++ ) {
        Customer customer = bank.getCustomer(i);

        System.out.println("Customer [" + (i+1) + "] is "
                + customer.getLastName()
                + ", " + customer.getFirstName());
    }
}
}

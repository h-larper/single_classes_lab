import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;            //declaring variable bankAccount



//    Testing Getters & Setters:

    @Test
    public void canGetFirstName() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000);    // calling method
        String result = bankAccount.getFirstName();         // lower case bankAccount (object) BankAccount (class)
        assertThat(result).isEqualTo("Laura");
    }

    @Test
    public void canSetFirstName() {              // before testing, need to test the get method 1st. + void so doesn't return anything, but changes the name called by get.
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000);
        bankAccount.setFirstName("Vince");                   // can't call inside variable bc doesn't return anything
        String result = bankAccount.getFirstName();         // able to return string
        assertThat(result).isEqualTo("Vince");
    }

    @Test
    public void canGetLastName() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000);
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Moon");
    }

    @Test
    public void canSetLastName() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000);
        bankAccount.setLastName("Noir");
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Noir");
    }

    @Test
    public void canGetAccountNumber() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000);
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(2000);
    }

    @Test
    public void canSetAccountNumber() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000);
        bankAccount.setAccountNumber(4000);
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(4000);
    }

}

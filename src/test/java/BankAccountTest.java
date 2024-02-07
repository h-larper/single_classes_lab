import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;            //declaring variable bankAccount

// Testing main methods:

    @Test
    public void canAddDeposit() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000, "Current Account");
        bankAccount.deposit(50);
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(50);
    }

    @Test
    public void canWithdraw() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000, "Current Account");
        bankAccount.withdrawal(10);
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(-10);
    }

    @Test
    public void canAddInterest() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000, "Savings Account");
        bankAccount.setBalance(10);
        bankAccount.interest();                         // has to go AFTER setting balance or will return 10 not 11 as expected
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(12);
    }

//    Testing Getters & Setters:

    @Test
    public void canGetFirstName() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000, "Current Account");    // calling method
        String result = bankAccount.getFirstName();         // lower case bankAccount (object) BankAccount (class)
        assertThat(result).isEqualTo("Howard");
    }

    @Test
    public void canSetFirstName() {              // before testing, need to test the get method 1st. + void so doesn't return anything, but changes the name called by get.
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000, "Current Account");
        bankAccount.setFirstName("Vince");                   // can't call inside variable bc doesn't return anything
        String result = bankAccount.getFirstName();         // able to return string
        assertThat(result).isEqualTo("Vince");
    }

    @Test
    public void canGetLastName() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000, "Current Account");
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Moon");
    }

    @Test
    public void canSetLastName() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000, "Current Account");
        bankAccount.setLastName("Noir");
        String result = bankAccount.getLastName();
        assertThat(result).isEqualTo("Noir");
    }

    @Test
    public void canGetDateOfBirth() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000, "Current Account");
        String result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo("010175");
    }

    @Test
    public void canSetDateOfBirth() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000, "Current Account");
        bankAccount.setDateOfBirth("010185");
        String result = bankAccount.getDateOfBirth();
        assertThat(result).isEqualTo("010185");
    }


    @Test
    public void canGetAccountNumber() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000, "Current Account");
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(2000);
    }

    @Test
    public void canSetAccountNumber() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000, "Current Account");
        bankAccount.setAccountNumber(4000);
        int result = bankAccount.getAccountNumber();
        assertThat(result).isEqualTo(4000);
    }

    @Test
    public void canGetBalance() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000, "Current Account");
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void canSetBalance() {
        BankAccount bankAccount = new BankAccount("Howard", "Moon", "010175", 2000, "current");
        bankAccount.setBalance(100);
        int result = bankAccount.getBalance();
        assertThat(result).isEqualTo(100);
    }


}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;            //declaring variable bankAccount

//    Testing Getters & Setters:

    @Test
    public void canGetFirstName() {
        BankAccount bankAccount = new BankAccount("Laura", "Harper", "171095", 2000);    // calling method
        String result = bankAccount.getFirstName();         // lower case bankAccount (object) BankAccount (class)
        assertThat(result).isEqualTo("Laura");
    }

}

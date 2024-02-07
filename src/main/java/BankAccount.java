public class BankAccount {

    private String firstName;               // Creating instance variables (?)
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;


    public BankAccount(String inputFirstName, String inputLastName, String inputdateOfBirth, int inputAccountNumber, int inputBalance) {               //Creating constructor function (?)
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputdateOfBirth;
        this.accountNumber = inputAccountNumber;
        this.balance = 0;
    }

}

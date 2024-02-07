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

//    GETTERS & SETTERS:


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

// Custructor ( Parameterised and Non-parameterised) , Constructor overloading, Constructor invoking from constructor, getter, setter

package Class_Constrcutor;

public class Bank {
    int accountNumber;
    int balance;
    String customerName;
    String email;
    int phoneNo;

    // Constructor overloading
    public Bank(){
        // we can also call constructor from the constructor
        // Using default value
        // Special case of this keyword it is calling parameterised constructor through this
        // And "this" line should be the first line in constructor
        this(0000,0,"Default name","NA",0000000000);
        System.out.println("Default Constructor Called");
     }

    public Bank(int accountNumber,int balance,String customerName,String email,int phoneNo){

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNo = phoneNo;

        // Shoudl not use setter else any validation require
        //setAccountNumber(accountNumber);
        //setBalance(balance);
        //setCustomerName(customerName);
        //setEmail(email);
        //setPhoneNo(phoneNo);
    }

    public Bank(String customerName, String email, int phoneNo) {
        // Default value of some field
        this(0000,0,customerName,email,phoneNo);
        this.customerName = customerName;
        this.email = email;
        this.phoneNo = phoneNo;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void deposit(int amount){
        this.balance += amount;
        System.out.println("Balance : " + this.balance);
    }

    public void withdraw(int amount){
        if(this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Balance : " + this.balance);
        }
        else
            System.out.println("Insufficent Balance");
    }
}

import java.util.Date;

public class BankAccount {
    public String accountNumber;
    public String accountName;
    public double balance;
    public Date openingDate;


    public BankAccount() {
        this.accountNumber = " ";
        this.accountName = " ;";
        this.balance = 0.0;
        this.openingDate = new Date(1, 1, 2000);
    }

    public BankAccount(String accountNumber, String accountName, double balance, int day, int month, int year) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.openingDate = new Date(day, month, year);


    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountNumber) {
        this.accountNumber = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(int day, int month, int year) {
        this.openingDate = new Date(day, month, year);
    }

    public Date getDOB() {
        return new Date(openingDate.getDay(), openingDate.getMonth(), openingDate.getYear());
    }

}


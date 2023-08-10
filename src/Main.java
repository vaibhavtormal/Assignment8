public class Main {
    public static void main(String [] args){
        BankAccount account = new BankAccount();
        BankAccount account1 = new BankAccount("12345678","Vaibhav",1000,8,7,2023);

        System.out.println("Account Details :");
        System.out.println("Account Number :"+ account.getAccountName());
        System.out.println("Account Name :"+ account.getBalance());
        System.out.println("Balance : "+account.getBalance());
        System.out.println("Opening Date "+ account.getOpeningDate().getDay()+" " +account.getOpeningDate().getMonth()+" "+account.getOpeningDate().getYear());


        System.out.println(" Account1 Details :");
        System.out.println("Account Number :"+ account1.getAccountName());
        System.out.println("Account Name :"+ account1.getBalance());
        System.out.println("Balance : "+account1.getOpeningDate().getYear());
        System.out.println("Opening Date "+ account1.getOpeningDate().getDay()+" " +account1.getOpeningDate().getMonth()+" "+account1.getOpeningDate().getYear());




    }
}
class BankAccount{
    //private variable
    private double balance ;

    //Constructor
    public BankAccount(double balance){
        this.balance = balance;
    }
    //Getter : read-only
    public double getBalance(){
        return balance;
    }

    //Setter : write-only
    public void deposit(double amount){

        if( amount >= 0){
            this.balance += amount;
        }
        else{
            System.out.println("Error: Cannot deposit negative money!");
        }
    }
}
public class EncapsulatedBanking {
    public static void main(String[] args){
        BankAccount bankAccount1 = new BankAccount(500);
        BankAccount bankAccount2 = new BankAccount(-100);
        BankAccount bankAccount3 = new BankAccount(250);

        bankAccount1.deposit(250);
        bankAccount2.deposit(50);
        bankAccount2.deposit(-500);


        System.out.println("Balance :" + bankAccount1.getBalance());
        System.out.println("Balance :" + bankAccount2.getBalance());
        System.out.println("Balance :" + bankAccount3.getBalance());
    }
}

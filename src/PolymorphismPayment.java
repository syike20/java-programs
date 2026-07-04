class Payment{
    void ProcessPayment(){
        System.out.println("Processing a standard cash payment...");
    }
}
class CreditCard extends Payment{
    @Override
    void ProcessPayment(){
        System.out.println("Swiping credit card and charging a 2% fee...");
    }
}
class Bitcoin extends Payment{
    @Override
    void ProcessPayment(){
        System.out.println("Connecting to the blockchain...");
    }
}
public class PolymorphismPayment {
    public static void main(String[] args){
        Payment payment = new Payment();
        CreditCard creditcard = new CreditCard();
        Bitcoin bitcoin = new Bitcoin();

        payment.ProcessPayment();
        creditcard.ProcessPayment();
        bitcoin.ProcessPayment();
    }
}

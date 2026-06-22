
import java.util.Scanner;
public class Compound_Interest {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome this is a Compound Interest Calculator!!");
        System.out.println("Add the Necessary Information for Calculations");
        System.out.print("Initial principal balance($): ");
        double Initial_principal_balance = scanner.nextDouble();
        System.out.print("Annual interest rate(%):)");
        double Annual_interest_rate = scanner.nextDouble()/100;
        System.out.print("Number of times interest is compounded per year: ");
        double n = scanner.nextDouble();
        System.out.print("Time the money is invested or borrowed for, in years: ");
        double time = scanner.nextDouble();
        double A = Initial_principal_balance*(Math.pow(1 + (Annual_interest_rate/n),n*time));
        System.out.printf("Final Amount is %.2f",A);




        scanner.close();
    }
}
import java.util.Scanner;
public class calculator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter operation to be performed (+,-,/,*");
        String operator = scanner.next();
        System.out.println("Enter number 2 ");
        double num2 = scanner.nextDouble();
        double ans =0;
        switch (operator){
            case "+" -> ans = num1+num2;
            case "-" -> ans = num1-num2;
            case "*" -> ans = num1*num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Division by zero is mathematically incorrect.");
                    scanner.close();
                    return;
                }else {
                    ans = num1 / num2;
                }
            }
            default -> System.out.println("Please enter a valid operator");
        }
        System.out.println("Answer :" + ans);
        scanner.close();
    }
}
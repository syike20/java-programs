public class ExceptionHandlingCalculator {
    public static void main(String[] args){
        int numerator = 10;
        int denominator = 0;
        try{
            System.out.println(numerator / denominator);
        }
        catch(Exception e){
            System.out.println("Math Error: You cannot divide by zero!");

        }
        System.out.println("Program finished successfully!");
    }
}


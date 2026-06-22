import java.util.Scanner;
public class practise {
    public static void main(String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int age ;
        System.out.print("Enter your age :");
        age = scanner.nextInt();
        ageVerification(age);
    }
     static void ageVerification(int age)
    {

        if(age>18)
        {
            System.out.println("You are eligible ");

        }
        else{
            System.out.println("You are not eligible ");
        }



    }
}
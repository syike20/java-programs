import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //Welcome Message
        System.out.println("----------------------------------");
        System.out.println("Let's Play ROCK PAPER SCISSORS !!!");
        System.out.println("----------------------------------");

        //Game Logic
        boolean Continue = true ;

        while (Continue)
        {
            //Take player choice
            System.out.print("Enter your choice (rock,paper,scissors): ");
            String PlayerChoice = scanner.nextLine().toUpperCase();

            //Generate Computer's Choice
            String[] Options = {"ROCK","PAPER","SCISSORS"};
            String ComputerOption = Options[random.nextInt((Options.length))];

            System.out.println();

            //Game Logic
            if(PlayerChoice.equals("ROCK") && (ComputerOption.equals("SCISSORS"))){
                System.out.println("YOU WIN !!");
            } else if (PlayerChoice.equals("PAPER") && (ComputerOption.equals("ROCK"))) {
                System.out.println("YOU WIN !!");
            } else if (PlayerChoice.equals("SCISSORS") && (ComputerOption.equals("PAPER"))) {
                System.out.println("YOU WIN !!");
            } else if (PlayerChoice.equals(ComputerOption)) {
                System.out.println("ITS A DRAW !!");
            }else if (!PlayerChoice.equals("ROCK") && !PlayerChoice.equals("PAPER") && !PlayerChoice.equals("SCISSORS")){
                System.out.println("PLEASE ENTER A VALID CHOICE !! ");
                continue;
            }
            else{
                System.out.println("YOU LOSE :( ");
            }
            System.out.print("Opponent Choice: " + ComputerOption);

            //Continue Option
            System.out.print("PLAY AGAIN?(Press Y/N): ");
            String contiOption = scanner.nextLine().toUpperCase();
            if(contiOption.equals("N"))
            {
                System.out.println("---------------------------------");
                System.out.println("THANK YOU FOR PLAYING WITH ME !! ");
                System.out.println("---------------------------------");
                Continue = false;
            }


        }


        scanner.close();

    }
}
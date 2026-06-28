import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("---------------------");
        System.out.println("Welcome to Java Slots");
        System.out.println("---------------------");

        while (balance > 0) {
            System.out.printf("Balance: %d \n", balance);
            System.out.print("Place your bet amount: $");
            bet = scanner.nextInt();
            scanner.nextLine();
            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS!!");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet should be greater than zero !!");
                continue;
            } else {
                balance -= bet;
            }
            System.out.println("Spinning.....");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);
            if (payout > 0) {
                balance += payout;
                System.out.println("You Won!!! " + payout);
            } else {
                System.out.println("Sorry You Lost !!");
            }
            System.out.println("Do you want to play again ?[Y/N] ");
            playAgain = scanner.nextLine().toUpperCase();
            if (!playAgain.equals("Y")) {
                break;
            }
        }
        System.out.println("GAME OVER !!");
        System.out.println("Final Balance is $"+balance);
        System.out.println("Thank You For Playing !!");
    }

    static String[] spinRow() {
        String[] symbols = {"🍇", "🥭", "⭐", "🌸", "💎"};
        String[] row = new String[3];//row is a empty array that can hold three strings
        Random random = new Random();
        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row) {
        System.out.println("--------------");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("--------------");

    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[2].equals(row[1])) {
            return switch (row[0]) {
                case "🍇" -> bet * 2;
                case "🥭" -> bet * 4;
                case "⭐" -> bet * 6;
                case "🌸" -> bet * 8;
                case "💎" -> bet * 10;
                default -> 0;
            };
        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍇" -> bet * 2;
                case "🥭" -> bet * 3;
                case "⭐" -> bet * 4;
                case "🌸" -> bet * 5;
                case "💎" -> bet * 6;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍇" -> bet * 2;
                case "🥭" -> bet * 3;
                case "⭐" -> bet * 4;
                case "🌸" -> bet * 5;
                case "💎" -> bet * 6;
                default -> 0;
            };

        }
        return 0;
    }
}
import java.util.Scanner;
void main() {
    System.out.println("<Weight Calculator>");
    System.out.println("To convert Kilograms into Pounds Press 1 OR To convert Pounds into Kilograms Press 2 ");
    Scanner scanner = new Scanner(System.in);
    int option = scanner.nextInt();
    if (option == 1) {
        System.out.print("Provide value of Kilograms: ");
        double value1 = scanner.nextDouble();
        double pounds = value1 * 2.2046;
        System.out.printf("Value in Pounds: %.2f",pounds);
    } else if (option == 2) {
        System.out.print("Provide value of Pounds: ");
        double value2 = scanner.nextDouble();
        double kilograms = value2 / 2.2046;
        System.out.printf("Value in Kilograms: %.2f",kilograms);
    }else{
        System.out.println("Please Provide a valid input.");
    }
    scanner.close();
}
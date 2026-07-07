import java.util.Scanner;

public class Tables {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num + "x" + i +"="+ num*i);
        }
    }
}

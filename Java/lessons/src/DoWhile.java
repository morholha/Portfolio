import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val;
        do{
            System.out.println("Enter 5");
            val = scanner.nextInt();
        } while(val!=5);
        System.out.println("You entered 5");
        }
    }

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        System.out.print("Enter no. you want to check :- ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}

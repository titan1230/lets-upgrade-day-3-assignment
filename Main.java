import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            even_odd();
        } catch (Exception e) {

            System.out.println("Error occurred due to incorrect data type entered");
        }

    }

    public static void even_odd() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. you want to check :- ");

        int a = scan.nextInt();

        if (a > 2147483647) {
            System.out.println("Number entered out of integer limit.");
        } else if (a%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
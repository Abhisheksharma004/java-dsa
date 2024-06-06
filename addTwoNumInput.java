import java.util.Scanner;

public class addTwoNumInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num 1 :");
        int a = sc.nextInt();
        System.out.print("Enter Num 2 :");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}

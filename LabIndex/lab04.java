import java.util.*;
class lab04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num 1 :");
        int a = sc.nextInt();

        System.out.print("Enter Num 2 :");
        int b = sc.nextInt();

        int sum = a + b;
	int sub = a - b;
	int mul = a * b;
	int div = a / b;
	int rem = a % b;
        System.out.println("Sum = " + sum);
	System.out.println("Sub = " + sub);
	System.out.println("Mul = " + mul);
	System.out.println("Div = " + div);
	System.out.println("Rem = " + rem);
    }
}

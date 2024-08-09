import java.util.*;

public class lab05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Product: ");
        double pro1 = sc.nextDouble();

        System.out.print("Enter the second Product: ");
        double pro2 = sc.nextDouble();

        double product = pro1 * pro2;

        System.out.println("The product of " + pro1 + " and " + pro2 + " is " + product);

    }
}

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1 :
                System.out.println("Hello");
                break;
            case 2 :
                System.out.println("Namaste");
                break;
            case 3 :
                System.out.println("Banjour");
                break;
            default:
                System.out.println("Invalid Case");
        }
    }
}

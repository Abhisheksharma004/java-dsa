import java.util.Scanner;

public class ifCondition {
    public static void main(String[] args) {
//        if age>=18 than print adult or not adult
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Age : ");
//        int age = sc.nextInt();
//        if (age >= 18){
//            System.out.println("You are Adult ");
//        }else {
//            System.out.println("You are Not Adult");
//        }

//        print odd or even number using java
        System.out.print("Enter Number : ");
        int x = sc.nextInt();
        if( x % 2 == 0 ){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }

}

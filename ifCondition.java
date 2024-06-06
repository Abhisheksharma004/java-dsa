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
//


//        write a program in given condition
//                a = b -> equal
//                a > b -> a is grater
//                a < b -> a is lesser
        System.out.println("Enter Value A : ");
        int a = sc.nextInt();
        System.out.println("Enter Value B : ");
        int b = sc.nextInt();
        if ( a == b ){
            System.out.println("Equal");
        }else {
            if ( a > b ){
                System.out.println("A id Grater");
            }else {
                System.out.println("A is Lesser");
            }
        }
    }

}

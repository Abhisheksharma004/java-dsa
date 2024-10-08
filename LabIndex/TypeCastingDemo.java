public class TypeCastingDemo {
    public static void main(String[] args) {
        
        // Implicit Type Casting (Widening)
        int num = 100;
        double doubleNum = num;
        
        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + num);
        System.out.println("Converted to double: " + doubleNum);
        
        // Explicit Type Casting (Narrowing)
        double largeNum = 99.99;
        int intNum = (int) largeNum;
        
        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double value: " + largeNum);
        System.out.println("Converted to integer: " + intNum);
    }
}

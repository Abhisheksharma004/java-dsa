public class OperatorsDemo {
    public static void main(String[] args) {
        
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        
        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        
        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 2: " + (a << 2));
        System.out.println("a >> 2: " + (a >> 2));
        
        // Assignment Operators
        int c = 10;
        System.out.println("\nAssignment Operators:");
        c += 5;
        System.out.println("c += 5: " + c);
        c -= 3;
        System.out.println("c -= 3: " + c);
        c *= 2;
        System.out.println("c *= 2: " + c);
        c /= 4;
        System.out.println("c /= 4: " + c);
        c %= 3;
        System.out.println("c %= 3: " + c);
        
        // Unary Operators
        int d = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("d: " + d);
        System.out.println("++d: " + (++d));
        System.out.println("d++: " + (d++));
        System.out.println("d after post-increment: " + d);
        System.out.println("--d: " + (--d));
        System.out.println("d--: " + (d--));
        System.out.println("d after post-decrement: " + d);
        
        // Ternary Operator
        int e = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("e = (a > b) ? a : b -> e = " + e);
    }
}

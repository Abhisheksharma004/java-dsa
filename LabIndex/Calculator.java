class Calculator {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three doubles
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Using overloaded add methods
        System.out.println("Sum of two integers: " + calculator.add(5, 10));
        System.out.println("Sum of three integers: " + calculator.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calculator.add(5.5, 10.5));
        System.out.println("Sum of three doubles: " + calculator.add(5.5, 10.5, 15.5));
    }
}

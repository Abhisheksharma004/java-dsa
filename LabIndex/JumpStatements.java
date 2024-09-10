class JumpStatementsDemo {
    public static void main(String[] args) {
        // Example of 'break'
        System.out.println("Example of break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // Exits the loop when i is 5
            }
            System.out.print(i + " ");
        }
        System.out.println("\nLoop exited using break.\n");

        // Example of 'continue'
        System.out.println("Example of continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;  // Skips the rest of the loop iteration when i is 5
            }
            System.out.print(i + " ");
        }
        System.out.println("\nLoop continued after skipping 5 using continue.\n");

        // Example of 'return'
        System.out.println("Example of return:");
        printUntilNumber(7);
    }

    public static void printUntilNumber(int limit) {
        for (int i = 1; i <= 10; i++) {
            if (i > limit) {
                return;  // Exits the method when i exceeds the limit
            }
            System.out.print(i + " ");
        }
        System.out.println("\nMethod exited using return.");
    }
}

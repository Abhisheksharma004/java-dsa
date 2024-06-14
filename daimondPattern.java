public class daimondPattern {
    public static void main(String[] args) {
        int n = 7; // Number of rows for the pattern

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && (j == 3 || j == 4 || j == 5)) ||
                        (i == 1 && (j == 2 || j == 3 || j == 4 || j == 5 || j == 6)) ||
                        (i == 2 && j != 0) ||
                        (i == 3) ||
                        (i == 4) ||
                        (i == 5 && (j == 1 || j == 2 || j == 3 || j == 4 || j == 5)) ||
                        (i == 6 && (j == 2 || j == 3 || j == 4))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

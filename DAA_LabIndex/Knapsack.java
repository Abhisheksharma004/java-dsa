public class Knapsack {

    // Function to return the maximum value that can be put in a knapsack of capacity W
    public static int knapSack(int W, int[] wt, int[] val, int n) {
        // Base Case: If no items are left or the capacity is 0
        if (n == 0 || W == 0) {
            return 0;
        }

        // If the weight of the nth item is more than the knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (wt[n - 1] > W) {
            return knapSack(W, wt, val, n - 1);
        } else {
            // Return the maximum of two cases:
            // 1. nth item included
            // 2. not included
            int included = val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1);
            int excluded = knapSack(W, wt, val, n - 1);
            return Math.max(included, excluded);
        }
    }

    public static void main(String[] args) {
        int[] val = {60, 100, 120}; // Values of items
        int[] wt = {10, 20, 30};    // Weights of items
        int W = 50;                 // Knapsack capacity
        int n = val.length;         // Number of items

        System.out.println("Maximum value that can be obtained: " + knapSack(W, wt, val, n));
    }
}

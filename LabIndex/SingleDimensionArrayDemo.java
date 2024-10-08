public class SingleDimensionArrayDemo {
    public static void main(String[] args) {
        
        // Declare and initialize a single-dimensional array
        int[] arr = {10, 20, 30, 40, 50};
        
        // Display the elements of the array
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
        
        // Sum of all elements in the array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("\nSum of array elements: " + sum);
        
        // Find the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array: " + max);
        
        // Find the minimum element in the array
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in array: " + min);
    }
}

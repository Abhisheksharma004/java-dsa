public class linearserch {
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40, 50};
            int target = 30;

            int index = linearSearch(numbers, target);

            if (index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found in the array.");
            }
        }

        public static int linearSearch(int[] array, int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i;
                }
            }
            return -1; // element not found
        }

}

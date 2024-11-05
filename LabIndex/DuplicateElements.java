import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 3};
        
        findDuplicates(array);
    }
    
    public static void findDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        
        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        
        if (duplicates.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
}

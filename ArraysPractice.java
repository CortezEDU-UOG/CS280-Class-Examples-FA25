import java.util.*;

class ArraysPractice {

    /**
     * Find the max value of an array of integers.
     * Invariants: The array must not be empty.
     * @param arr The array of integers to parse through.
     * @return The maximum integer value in the array.
     */
    public static int findMax(int[] arr) {
        // Checks if the array is empty and throws an exception.
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        // Otherwise, parse through the array to find the max value.
        int maxIndex = 0;
        for (int i=1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) maxIndex = i;
        }
        return arr[maxIndex];
    }

    /**
     * Removes the String elements in the list that are less than 3 chars long.
     * @param words The list of words to check.
     */
    public static void removeShortStrings(ArrayList<String> words) {
        words.removeIf(word -> word.length() < 3);
    }

    /**
     * Append an item to an array of Strings.
     * @param arr The array to append to.
     * @param item The item to append to the array.
     * @return The updated array.
     */
    public static String[] appendToArray(String[] arr, String item) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add(item);
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        int[] nums = {6, 2, 0, 10, 3, 1, 5};
        System.out.println("Max value of nums: " + findMax(nums));

        ArrayList<String> words = new ArrayList<>();
        words.add("Hello"); words.add("World"); words.add("Hi"); words.add("I"); words.add("Hola");
        removeShortStrings(words);
        System.out.println(words);

        String[] letters = {"a", "b", "c", "d"};
        letters = appendToArray(letters, "e");
        System.out.println(Arrays.toString(letters));

        // Note that the asList() method requires that the elements of the 
        // array being converted to an ArrayList must be a class type.
        Integer[] nums2 = {6, 2, 0, 10, 3, 1, 5};
        // Arrays.sort(nums2);    // You can use the sort() method from the Arrays class
        ArrayList<Integer> newNums = new ArrayList<>(Arrays.asList(nums2));
        Collections.sort(newNums);   // Or you can use the sort() method from the Collections class
        System.out.println(newNums);
    }
}
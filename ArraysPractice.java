import java.util.*;

class ArraysPractice {

    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        int maxIndex = 0;
        for (int i=1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) maxIndex = i;
        }
        return arr[maxIndex];
    }

    public static void removeShortStrings(ArrayList<String> words) {
        words.removeIf(word -> word.length() < 3);
    }

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

        Integer[] nums2 = {6, 2, 0, 10, 3, 1, 5};
        Arrays.sort(nums2);
        ArrayList<Integer> newNums = new ArrayList<>(Arrays.asList(nums2));
        System.out.println(newNums);
    }
}
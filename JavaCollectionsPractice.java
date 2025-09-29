import java.util.*;

class JavaCollectionsPractice {
    public static void main(String[] args) {
        String[] words = {"apple", "pear", "apple", "orange", "pear", "apple"};
        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {
            int count = wordFreq.getOrDefault(word, 0);
            wordFreq.put(word, count + 1);
            if (count == 1) System.out.println("Found a duplicate.");
        }
        System.out.println(wordFreq);

        Set<String> alphaSet = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println(alphaSet);

        List<String> wordsList = new ArrayList<>(Arrays.asList(words));
        double currentTimeMillis = System.currentTimeMillis();
        wordsList.contains("orange");
        System.out.println("ArrayList: " + (System.currentTimeMillis() - currentTimeMillis));

        double currentTimeMillisSet = System.currentTimeMillis();
        alphaSet.contains("orange");
        System.out.println("Set: " + (System.currentTimeMillis() - currentTimeMillisSet));

    }
}
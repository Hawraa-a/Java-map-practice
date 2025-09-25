import java.util.*;

class AnagramGrouper {
    /**
     * TO-DO: Group anagrams from the given array of strings.
     * \*
     *
     * @param strs An array of strings.
     * @return A List of Lists, where each inner list contains a group of anagrams.
     */
    public <Char> List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray(); // convert it to a char array
            Arrays.sort(chars);
            String newString = Arrays.toString(chars); // convert it back to a string
            // add the original string to the list
            anagramMap.computeIfAbsent(newString, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        AnagramGrouper grouper = new AnagramGrouper();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat", "tab"};

        List<List<String>> result = grouper.groupAnagrams(input);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (!result.isEmpty() && isAnagram(result.get(result.size() - 1), word)) {
                continue; // Skip if it's an anagram of the previous word
            }
            result.add(word);
        }
        
        return result;
    }

    private boolean isAnagram(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }
}

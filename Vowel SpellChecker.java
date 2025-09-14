import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>();
        Map<String, String> lowerMap = new HashMap<>();   
        Map<String, String> vowelMap = new HashMap<>();   
        for (String w : wordlist) {
            exact.add(w);
            String lw = w.toLowerCase();
            lowerMap.putIfAbsent(lw, w);
            String dv = devowel(lw);
            vowelMap.putIfAbsent(dv, w);
        }

        
        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exact.contains(q)) {                 
                ans[i] = q;
                continue;
            }
            String lq = q.toLowerCase();
            if (lowerMap.containsKey(lq)) {           
                ans[i] = lowerMap.get(lq);
                continue;
            }
            String dq = devowel(lq);
            if (vowelMap.containsKey(dq)) {           
                ans[i] = vowelMap.get(dq);
            } else {
                ans[i] = "";
            }
        }
        return ans;
    }


    private String devowel(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if (isVowel(c)) sb.append('*');
            else sb.append(c);
        }
        return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

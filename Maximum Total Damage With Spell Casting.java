import java.util.*;

class Solution {
    public long maximumTotalDamage(int[] power) {
        
        Map<Integer, Long> damageMap = new HashMap<>();
        for (int p : power) {
            damageMap.put(p, damageMap.getOrDefault(p, 0L) + p);
        }

      
        List<Integer> unique = new ArrayList<>(damageMap.keySet());
        Collections.sort(unique);

        int n = unique.size();
        long[] dp = new long[n];

        for (int i = 0; i < n; i++) {
            long currDamage = damageMap.get(unique.get(i));
            int j = i - 1;

            
            while (j >= 0 && unique.get(i) - unique.get(j) <= 2) {
                j--;
            }

            long include = currDamage + (j >= 0 ? dp[j] : 0);
            long exclude = i > 0 ? dp[i - 1] : 0;

            dp[i] = Math.max(include, exclude);
        }

        return dp[n - 1];
    }
}

class Solution {
    public int maxFreqSum(String s) {
        int maxc = 0;
        int maxv = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int c = 1;  
            char ch = s.charAt(i);

          
            if (sb.toString().contains(String.valueOf(ch))) continue;

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    c++;
                }
            }

           
            sb.append(ch);

            if (isVowel(ch)) {
                maxv = Math.max(maxv, c);
            } else {
                maxc = Math.max(maxc, c);
            }
        }
        return maxc + maxv;
    }

    private boolean isVowel(char ch) {
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        int c=0;
        for(String word:words){
            boolean canType=true;
            for(int i=0;i<word.length();i++){
                if(brokenLetters.indexOf(word.charAt(i))!=-1){
                canType=false;
                break;
           }
            }
            if(canType) c++;
           
        }
        return c;
    }
}

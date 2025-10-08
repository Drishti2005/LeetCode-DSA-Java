class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] result=new int[spells.length];
        for(int i=0;i<spells.length;i++){
           long minpotion=(success+spells[i]-1)/spells[i];
           int index=binarysearch(potions,minpotion);
           result[i]=potions.length-index;
        }
        return result;
    }
    private int binarysearch(int[] potions,long minpotion){
        int left=0,right=potions.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(potions[mid]<minpotion){
                left=mid-1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}

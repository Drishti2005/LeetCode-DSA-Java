class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       

        int lo=0;
        
        int ml=Integer.MAX_VALUE;
        int s=0;
        for(int hi=0;hi<nums.length;hi++){
            s+=nums[hi];
            while(s>=target){
                 ml = Math.min(ml, hi-lo+1);
                 s -= nums[lo];
                lo++;
            }
        }
        return (ml == Integer.MAX_VALUE) ? 0 : ml;
    }
}

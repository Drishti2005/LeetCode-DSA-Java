class Solution {
    public int longestOnes(int[] nums, int k) {
        int lo=0;
        int max=0;
        int zc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zc++;
            }
            while(zc>k){
                if(nums[lo]==0){
                    zc--;
                }
                lo++;
            }
            max=Math.max(max,i-lo+1);
        }
        return max;
    }
}

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int prev=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++){
            int minval=nums[i]-k;
            int maxval=nums[i]+k;
            if(prev<minval){
                prev=minval;
                c++;
            }else if(prev<nums[i]+k){
                prev=prev+1;
                c++;
            }
        }

        return c;
    }
}

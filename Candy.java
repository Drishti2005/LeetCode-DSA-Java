class Solution {
    public int candy(int[] nums) {
        int[] candies=new int[nums.length];
        int n=nums.length;
        Arrays.fill(candies,1);
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        int t=0;
        for(int c:candies){
            t+=c;
        }
        return t;
        
    }
}

class Solution {
    public int jump(int[] nums) {
       int c=0;
       int ce=0;
       int ft=0;
       for(int i=0;i<nums.length-1;i++){
        ft=Math.max(ft,i+nums[i]);
        if(i==ce){
            c++;
            ce=ft;
        }
       }
       return c;
    }
}

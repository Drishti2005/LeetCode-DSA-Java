class Solution {
    public int maxFrequencyElements(int[] nums) {
    int[] freq=new int[101];
    for(int num:nums){
        freq[num]++;
    }
    int mf=0;
    for(int f:freq){
        if(f>mf){
            mf=f;
        }
    }
    int ans=0;
    for(int f:freq){
        if(f==mf){
            ans+=f;
        }
    }
      return ans;
    }
}

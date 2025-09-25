class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res =new ArrayList<>();
        if(nums.length<4){
            return res;
        }
         Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int st=j+1;
                int en=nums.length-1;
                //int j=nums.length-1-i;
            while(st<en){
                long ans=(long)nums[i]+nums[j]+nums[st]+nums[en];
                if(ans==target){
                    res.add(Arrays.asList(nums[i], nums[j], nums[st], nums[en]));
                    while(st<en && nums[st]==nums[st+1]){
                        st++;
                    }
                    while(st<en && nums[en]==nums[en-1]){
                        en--;
                    }
                    st++;
                    en--;
                }
                else if(ans<target){
                    st++;
                }else{
                    en--;
                }
            }
            }
            
        }
        return res;
    }
        
}
   

class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> ll=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<ll.size();j++){
                if(ll.get(j) == nums[i]){
                    c++;
                }
                
            }
            if(c<2 ){
                    ll.add(nums[i]);
                    
                }
            
        }
         for (int i = 0; i < ll.size(); i++) {
            nums[i] = ll.get(i);
        }
        return ll.size();
    }
}

class Solution {
    public int firstMissingPositive(int[] nums) {
       int min=0;
       Stack<Integer> st=new Stack<>();
       Arrays.sort(nums);
       for(int i=0;i<nums.length;i++){
        if(nums[i]<=0){
            continue;
        }

        if(st.isEmpty()){
            if(nums[i]!=1) return 1;
            st.push(nums[i]);
        }else{
            if(st.peek()==nums[i] ) continue;
            if(nums[i]>st.peek()+1){
            return st.peek()+1;
            }
            st.push(nums[i]);
        }

       
        
    }
    return st.isEmpty() ?1:st.peek()+1;
    }
}

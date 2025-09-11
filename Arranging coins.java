class Solution {
    public int arrangeCoins(int n) {
        long lo=1;
        long hi=n;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            long c=mid*(mid+1)/2;
            if(c==n){
                return (int)mid;
            }else if(c<n){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
            
        }
        return (int) hi;
    }
    
}

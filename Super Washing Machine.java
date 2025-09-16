class Solution {
    public int findMinMoves(int[] machines) {
        int s=0;
        int n=machines.length;
        for(int k:machines ){
            s+=k;
        }
        if(s%n!=0) return -1;
        int target=s/n;
        int cb=0,moves=0;

        for(int m:machines){
            int load=m-target;
            cb+=load;
            moves = Math.max(moves, Math.max(Math.abs(cb), load));
        }
        return moves;
    }
}

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n=rains.length;
        int[] ans=new int[n];
        Map<Integer,Integer> fulllakes=new HashMap<>();
        TreeSet<Integer> drydays=new TreeSet<>();
        for(int i=0;i<n;i++){
            int lake=rains[i];
            if(lake==0){
                drydays.add(i);
                ans[i]=1;
            }else{
                if(fulllakes.containsKey(lake)){
                    int lastrainday=fulllakes.get(lake);
                    Integer dryday=drydays.higher(lastrainday);
                    if(dryday==null){
                        return new int[0];
                    }
                    ans[dryday]=lake;
                    drydays.remove(dryday);
                }
                fulllakes.put(lake,i);
                ans[i]=-1;
            }
            
        }
        return ans;
    }
}

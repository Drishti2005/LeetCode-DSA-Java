class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ll=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(selfdeviding(i)){
                ll.add(i);
            }
        }
        return ll;
    }
    public static boolean selfdeviding(int n){
        int original=n;
        while(n>0){
            int digit=n%10;
            if(digit==0 || original%digit!=0){
                return false;
            }
            n/=10;
        }
        return true;
    }
}

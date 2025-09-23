class Solution {
    public int nthUglyNumber(int n) {
        //Approach1---> Give Tle

        
    //     ArrayList <Integer> ll=new ArrayList<>();
    //    int c=0,num=1;
    //    while(true){
    //     if(isugly(num)){
    //         c++;
    //         if(c==n) return num;
    //     }
    //     num++;
    //    }
    // }
    // public static boolean isugly(int n){
    //     if(n<=0) return false;
    //     for(int i:new int[]{2,3,5}){
    //         while(n%i==0) n/=i;
    //     }
    //     return n==1;
    // }

    int[] ugly=new int[n];
    ugly[0]=1;
    int i2=0,i3=0,i5=0;
    for(int i=1;i<n;i++){
        int n2=ugly[i2]*2;
        int n3=ugly[i3]*3;
        int n5=ugly[i5]*5;

        int nu=Math.min(n2,Math.min(n3,n5));
        ugly[i]=nu;
        if(nu==n2) i2++;
        if(nu==n3) i3++;
        if(nu==n5) i5++;
    }
    return ugly[n-1];
    }
}

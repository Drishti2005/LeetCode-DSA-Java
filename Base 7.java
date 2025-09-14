class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        boolean isneg=num<0;
        num=Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            int digit=num%7;
           sb.append(digit);
            num=num/7;
        }
        if (isneg) sb.append("-");
        return sb.reverse().toString();
    }
}

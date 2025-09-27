class Solution {
    public double largestTriangleArea(int[][] points) {
        double ma=0;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                for(int k=j+1;k<points.length;k++){
                    int[] a=points[i];
                    int[] b=points[j];
                    int[] c=points[k];
                    double area=0.5 *Math.abs(
                        a[0]*(b[1]-c[1])+
                        b[0]*(c[1]-a[1])+
                        c[0]*(a[1]-b[1])
                    );
                    ma=Math.max(ma,area);
                }
            }
        }
        return ma;
    }
}

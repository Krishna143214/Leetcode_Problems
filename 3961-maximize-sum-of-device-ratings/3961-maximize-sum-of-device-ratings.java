import java.util.Arrays;
class Solution {
    public long maxRatings(int[][] units) {
        int [][]copy=units;
        int m=units.length;
        int n=units[0].length;

        for(int i=0;i<m;i++){
            Arrays.sort(copy[i]);
        }

        if(n==1){
            long ans=0;
            for(int i=0;i<m;i++){
                ans=ans+copy[i][0];
            }
            return ans;
        }

      

        long tsum=0;
        int min2=Integer.MAX_VALUE;
        int globalm=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            globalm=Math.min(globalm,copy[i][0]);
            min2=Math.min(min2,copy[i][1]);

            tsum=tsum+copy[i][1];
           

           
        }

        return tsum-min2+globalm;

        
        
    }
}
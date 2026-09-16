import java.util.Arrays;
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        Arrays.sort(potions);

        int res[]=new int[spells.length];

        for(int i=0;i<spells.length;i++){


            long j=0;
            long k=potions.length-1;
            long r=-1;

            while(j<=k){
                int mid=(int)(j+k)/2;

                long n=(long)spells[i]*(long)potions[mid];

                if(n<success){
                    j=mid+1;
                }
                else{
                    r=mid;
                    k=mid-1;
                }
            }

            if(r==-1){
                res[i]=0;
            }

            else{
                int c=potions.length-(int)r;

                res[i]=c;
            }
        }

        return res;

        
    }
}
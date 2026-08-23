import java.util.HashSet;
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> kk=new HashSet<>();

        for(int i=0;i<banned.length;i++){
            kk.add(banned[i]);
        }
int j=0;
int c=0;

        for(int i=1;i<=n;i++){
            if(kk.contains(i)){
                continue;
            }

            if(j+i<=maxSum){
                c++;
                j=j+i;
            }

        }

        return c;
        
    }
}
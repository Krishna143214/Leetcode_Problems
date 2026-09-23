import java.util.HashSet;
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int res[]=new int[A.length];


        HashSet<Integer> kk=new HashSet<>();


        for(int i=0;i<A.length;i++){
            kk.add(A[i]);
            int c=0;

            for(int j=0;j<=i;j++){
                if(kk.contains(B[j])){
                    c++;
                }
            }

            res[i]=c;
        }
        return res;
    }
}
class Solution {
    public int busyStudent(int[] sT, int[] eT, int q) {

int c=0;
        for(int i=0;i<sT.length;i++){
            if(sT[i]<=q&&eT[i]>=q){
                c++;
            }

        }

        return c;
        
    }
}
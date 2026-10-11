class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {

        int c=0;
        int ind=0;


        for(int i=0;i<mat.length;i++){
            int l=0;
            for(int j=0;j<mat[i].length;j++){

                if(mat[i][j]==1){
                    l++;
                }

            }

            if(l>c){
                c=l;
                ind=i;
            }
        }


        return new int[]{ind,c};
        
    }
}
class Solution {
    public int[] findPeakGrid(int[][] mat) {

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                int a=0;
                int b=0;
                int c=0;
                int d=0;
if(i==0){
a=-1;
}

else{
    a=mat[i-1][j];
}
if(i==mat.length-1){
    b=-1;
}
else{
    b=mat[i+1][j];
}

if(j==0){
    c=-1;
}
else{
    c=mat[i][j-1];
}

if(j==mat[i].length-1){
    d=-1;
}

else{
    d=mat[i][j+1];
}

if(mat[i][j]>a&&mat[i][j]>b&&mat[i][j]>c&&mat[i][j]>d){
    return new int[]{i,j};
}






            }
        }



        return new int[]{-1,-1};
        
    }
}
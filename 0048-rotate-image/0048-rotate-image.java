class Solution {
    public void rotate(int[][] mat) {

for(int i=0;i<mat.length;i++){
    for(int j=i+1;j<mat[i].length;j++){

        int t=mat[j][i];
        mat[j][i]=mat[i][j];
        mat[i][j]=t;

    }
}

for(int i=0;i<mat.length;i++){
    int k=0;
    int j=mat[i].length-1;

    while(k<j){
        int t=mat[i][k];
        mat[i][k]=mat[i][j];
        mat[i][j]=t;
        k++;
        j--;
    }

}






   

    
        
    }
}
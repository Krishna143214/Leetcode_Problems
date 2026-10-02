class Solution {
    public int matrixScore(int[][] grid) {


        if(grid[0][0]==0&&grid.length==1&&grid[0].length==1){
            return 1;
        }


        for(int i=0;i<grid.length;i++){
            int o=0;
            int z=0;
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==0){
                    z++;
                }
                else{
                    o++;
                }
            }

            if(grid[i][0]==0){

                   for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==0){
                grid[i][j]=1;
                }
                else{
                grid[i][j]=0;
                }
            }


            }
        }









        
        for(int i=0;i<grid[0].length;i++){
            int o=0;
            int z=0;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==0){
                    z++;
                }
                else{
                    o++;
                }
            }

            if(z>o){

                   for(int j=0;j<grid.length;j++){
                if(grid[j][i]==0){
                grid[j][i]=1;
                }
                else{
                grid[j][i]=0;
                }
            }


            }
        }






int c=0;



    for(int i=0;i<grid.length;i++){
           StringBuilder ll=new StringBuilder();
            for(int j=0;j<grid[i].length;j++){
              ll.append((char) (grid[i][j]+'0'));
              
            }

            c=c+Integer.parseInt(ll.toString(),2);

         


            }




            return c;
        






        
    }
}
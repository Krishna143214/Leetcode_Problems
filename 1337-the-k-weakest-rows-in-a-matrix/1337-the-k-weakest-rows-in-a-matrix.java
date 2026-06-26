import java.util.PriorityQueue;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        PriorityQueue<pair> kk=new PriorityQueue<>(
            (a,b)->{
                if(a.count!=b.count){
                    return a.count-b.count;
                }
                return a.ind-b.ind;
            }
        );


        for(int i=0;i<mat.length;i++){

            int count=0;
        for(int j=0;j<mat[i].length;j++){

            if(mat[i][j]==1){
                count++;
            }
        }

        kk.add(new pair(i,count));      
                            }


       
        


        int ans[]=new int [k];



        for(int i=0;i<k;i++){
            pair s= kk.poll();

            ans[i]=s.ind;

        }

        return ans;


    

     
  
    }
}

class pair{
    int ind;
    int count;

    pair(int a,int b){
        ind=a;
        count=b;
    }
}




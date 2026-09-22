import java.util.PriorityQueue;
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {

        PriorityQueue<pair> kk=new PriorityQueue<>(
            (a,b)->{
                if(a.val!=b.val){
                    return b.val-a.val;
                }

                return a.ind-b.ind;
            }
        );

        for(int i=0;i<score.length;i++){
            kk.add(new pair(score[i][k],i));
        }

        int res[][]=new int[score.length][score[0].length];
        int o=0;
while(!kk.isEmpty()){
            pair m=kk.poll();


            for(int j=0;j<score[0].length;j++){

                res[o][j]=score[m.ind][j];

            }
            o++;

            
        }

        return res;



        
    }
}

class pair{
    int val;
    int ind;

    pair(int a,int b){
        val=a;
        ind=b;
    }
}
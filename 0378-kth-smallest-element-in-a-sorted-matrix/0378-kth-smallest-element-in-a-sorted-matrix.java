
import java.util.PriorityQueue;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<Integer> kk=new PriorityQueue<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                kk.add(matrix[i][j]);
            }
        }


       for(int i=1;i<k;i++){
        kk.poll();

       }
       return kk.peek();
 








}




        
    }

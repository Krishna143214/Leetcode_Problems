import java.util.PriorityQueue;
class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {

        PriorityQueue<Integer> kk=new PriorityQueue<>(Collections.reverseOrder());

     for(int i=0;i<grid.length;i++){
        PriorityQueue<Integer> ll=new PriorityQueue<>(Collections.reverseOrder());
        for(int j=0;j<grid[i].length;j++){
            ll.add(grid[i][j]);

        }

       

        for(int m=0;m<limits[i];m++){
            kk.add(ll.poll());
        }

     }


     long ans=0;


     for(int i=0;i<k;i++){
        ans=ans+kk.poll();
     }


     return ans;   


        
    }
}
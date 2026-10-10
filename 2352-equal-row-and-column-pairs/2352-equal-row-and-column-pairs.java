import java.util.HashMap;
class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> kk=new HashMap<>();



        for(int i=0;i<grid[0].length;i++){
            StringBuilder ll=new StringBuilder();
            for(int j=0;j<grid.length;j++){

                ll.append((char)(grid[j][i]+'0'));

            }

            if(kk.containsKey(ll.toString())){
                kk.put(ll.toString(),kk.get(ll.toString())+1);
            }
            else{
                kk.put(ll.toString(),1);
            }
        }




        int c=0;


        for(int i=0;i<grid.length;i++){
            StringBuilder oo =new StringBuilder();
            for(int j=0;j<grid[i].length;j++){
                oo.append((char)(grid[i][j]+'0'));

            }
            if(kk.containsKey(oo.toString())){
                c=c+kk.get(oo.toString());

            }
        }
        

        return c;
    }
}
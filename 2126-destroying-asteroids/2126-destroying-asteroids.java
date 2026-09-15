import java.util.Arrays;
class Solution {
    public boolean asteroidsDestroyed(int mas, int[] ast) {

        Arrays.sort(ast);

        long mass=mas;

        for(int i=0;i<ast.length;i++){
            if(ast[i]<=mass){
                mass=mass+ast[i];
            }
            else{
                return false;
            }

        }

        return true;

       
        
    }
}
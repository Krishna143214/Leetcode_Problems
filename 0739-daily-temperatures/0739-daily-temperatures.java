import java.util.Stack;
class Solution {
    public int[] dailyTemperatures(int[] temp) {

Stack<Integer> kk=new Stack<>();

int res[]=new int[temp.length];

for(int i=temp.length-1;i>=0;i--){
    if(kk.isEmpty()){
        kk.push(i);
        res[i]=0;
    }
    else if(temp[kk.peek()]<=temp[i]){
        while(!kk.isEmpty() &&temp[kk.peek()]<=temp[i]){
            kk.pop();
        }

        if(kk.isEmpty()){
            kk.push(i);
            res[i]=0;
        }
        else{
            int val=kk.peek()-i;
            kk.push(i);
            res[i]=val;

        }
    }

    else{
          int val=kk.peek()-i;
            kk.push(i);
            res[i]=val;
        
    }

   
}



return res;
 
    }
}

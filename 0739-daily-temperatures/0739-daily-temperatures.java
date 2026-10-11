import java.util.Stack;
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> kk=new Stack<>();

        int res[]=new int[temp.length];


        for(int i=temp.length-1;i>=0;i--){
            if(kk.isEmpty()){
                res[i]=0;
                kk.push(i);
            }

            else if(temp[kk.peek()]>temp[i]){
                res[i]=kk.peek()-i;
                kk.push(i);
            }

            else{
                while(!kk.isEmpty()&&temp[kk.peek()]<=temp[i]){
                    kk.pop();

                }

                if(kk.isEmpty()){
                    res[i]=0;
                    kk.push(i);
                }
                else{
                    res[i]=kk.peek()-i;
                    kk.push(i);
                }
            }
        }

        return res;


 
    }
}

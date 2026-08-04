import java.util.Stack;
import java.util.ArrayList;

class Solution {
    public List<String> buildArray(int[] target, int n) {

Stack<Integer> kk=new Stack<>();
ArrayList<String> jj=new ArrayList<>();
int i=1;
int j=0;

while(j<target.length){
   
        kk.push(i);
        jj.add("Push");
        if(i!=target[j]){
            kk.pop();
            jj.add("Pop");

        
        }
        else{
            j++;
        }
        i++;
    
}

return jj;


    }}




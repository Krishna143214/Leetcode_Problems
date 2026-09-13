import java.util.Stack;
import java.util.ArrayList;

class Solution {
    public List<String> buildArray(int[] target, int n) {

ArrayList<String> kk=new ArrayList<>();
int nn=1;
int i=0;

while(i<target.length&&nn<=n){

    if(nn==target[i]){
        kk.add("Push");
        i++;
    }
    else{
        kk.add("Push");
        kk.add("Pop");
    }

nn++;


}

return kk;

    }}




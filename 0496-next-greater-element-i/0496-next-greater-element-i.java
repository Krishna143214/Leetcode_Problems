
import java.util.Stack;
import java.util.HashMap;
class Solution {
 
 
 
 
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
Stack<Integer> m=new Stack<>();
 
 int res[]=new int[nums2.length];
 int y=nums2.length-1;

 for(int i=y;i>=0;i--){
    if(m.isEmpty()){
        res[i]=-1;
        m.push(nums2[i]);
    }
    else if(m.peek()<=nums2[i]){
        while(!m.isEmpty()&&m.peek()<=nums2[i]){
            m.pop();
        }
        if(m.isEmpty()){
            res[i]=-1;
            m.push(nums2[i]);
        }

        else{
            res[i]=m.peek();
            m.push(nums2[i]);
        }
    }
    else{
        res[i]=m.peek();
            m.push(nums2[i]);

    }
 }

 HashMap<Integer,Integer> kk=new HashMap<>();

 for(int i=0;i<res.length;i++){
    kk.put(nums2[i],res[i]);
 }

int out[]=new int[nums1.length];

for(int i=0;i<nums1.length;i++){
    out[i]=kk.get(nums1[i]);
}

return out;
        
    
    
    
    }
    
    
    
     }
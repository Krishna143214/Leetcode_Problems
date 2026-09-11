import java.util.HashMap;

class Solution {
    public int singleNonDuplicate(int[] a) {

int aa=0;

for(int i=0;i<a.length;i++){
    aa=aa^a[i];
}

return aa;
    
    
        
    }
}
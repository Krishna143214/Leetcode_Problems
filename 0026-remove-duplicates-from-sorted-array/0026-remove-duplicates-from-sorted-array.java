import java.util.HashMap;
class Solution {
    public int removeDuplicates(int[] a) {
  int k=0;
a[k]=a[0];
        for(int i=0;i<a.length;i++){

            if(a[k]!=a[i]){
                k++;
                a[k]=a[i];

            }
        }
return k+1;
         
}}
class Solution {
    public int peakIndexInMountainArray(int[] a){
        int i=0;
        int j=a.length-1;

        int res=-1;


        while(i<=j){
            int mid=(i+j)/2;

            if(a[mid]<a[mid+1]){
                i=mid+1;
            }
        
        else{
            res=mid;
            j=mid-1;
        }
        }

        return res;
        
  
        
    } 
} 
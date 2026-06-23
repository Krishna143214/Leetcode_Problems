import java.util.HashMap;
class Solution {
    public String kthDistinct(String[] arr, int k) {

        HashMap<String,Integer> kk=new HashMap<>();


        for(int i=0;i<arr.length;i++){
            if(kk.containsKey(arr[i])){
                kk.put(arr[i],kk.get(arr[i])+1);
            }
            else{
                kk.put(arr[i],1);
            }
        }

int l=0;
int i=0;
    while(i<arr.length){
        if(kk.get(arr[i])==1){
            l++;

        }
        if(l==k){
            return arr[i];
        }
        i++;

        
    }

    return "";
        
    }
}
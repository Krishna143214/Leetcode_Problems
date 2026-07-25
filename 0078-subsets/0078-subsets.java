import java.util.ArrayList;
class Solution {


    static void rec(int arr[],int i,List<Integer> temp,List<List<Integer>> ans){
if(i==arr.length){
    ans.add(new ArrayList<>(temp));
    return;
}
temp.add(arr[i]);
rec(arr,i+1,temp,ans);
temp.remove(temp.size()-1);
rec(arr,i+1,temp,ans);





    }
    public List<List<Integer>> subsets(int[] nums) {
   
   List<Integer> kk=new ArrayList<>();
   List<List<Integer>> ans=new ArrayList<>();

   rec(nums,0,kk,ans);
   return ans;



        
    }
}
import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> kk=new HashMap<>();


        for(int i=0;i<strs.length;i++){

char arr[]=strs[i].toCharArray();
Arrays.sort(arr);
String jj=new String(arr);

if(!kk.containsKey(jj)){

 kk.put(jj,new ArrayList<String>());

}

kk.get(jj).add(strs[i]);


            
        }



 List<List<String>> nn=new ArrayList<>();


 for(Map.Entry<String,ArrayList<String>> mm:kk.entrySet()){
    nn.add(mm.getValue());
 }       
        

        return nn;
    }
}
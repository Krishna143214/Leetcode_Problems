import java.util.HashMap;
class Solution {
    public int minDeletions(String s) {
        int c=0;
        HashMap<Character,Integer> kk=new HashMap<>();
        HashMap<Integer,Integer> k=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(kk.containsKey(s.charAt(i))){
                kk.put(s.charAt(i),kk.get(s.charAt(i))+1);
            }
            else{
                kk.put(s.charAt(i),1);
            }
        }

        for(Map.Entry<Character,Integer> ll:kk.entrySet()){
            if(k.containsKey(ll.getValue())){
            int j=ll.getValue();

            while(k.containsKey(j)&&j>0){
                j=j-1;
                c++;
            }
            if(j==0){

            }
            else{
                k.put(j,1);
            }

                
              
            
                   
                
            }
            else{
                k.put(ll.getValue(),1);
            }

        }

        return c;

        
    }
}
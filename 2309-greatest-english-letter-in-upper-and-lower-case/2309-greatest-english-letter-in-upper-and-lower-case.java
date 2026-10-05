import java.util.HashSet;

class Solution {
    public String greatestLetter(String s) {

        HashSet<Character> ll=new HashSet<>();


        for(int i=0;i<s.length();i++){
            ll.add(s.charAt(i));
        }


        StringBuilder kk=new StringBuilder();



        for(char a:ll){
            if(ll.contains((char)(a+32))){
                kk.append(a);
            }
        }


      char a[]=kk.toString().toCharArray();

      Arrays.sort(a);

      if(a.length==0){
        return new String("");

      }


     StringBuilder op=new StringBuilder();

     op.append(a[a.length-1]);

     return op.toString();
        
    }
}
import java.util.Stack;

class Solution {
    public int minimumDeletions(String s) {
        int count=0;

   Stack<Character> kk=new Stack<>();

   for(int i=0;i<s.length();i++){
    if(kk.isEmpty()){
        kk.push(s.charAt(i));
    }
   else if(kk.peek()=='b'&&s.charAt(i)=='a'){
    
        count++;
        kk.pop();
      
    }
    else {
        kk.push(s.charAt(i));
    }
   }
   return count;
        
    }
}
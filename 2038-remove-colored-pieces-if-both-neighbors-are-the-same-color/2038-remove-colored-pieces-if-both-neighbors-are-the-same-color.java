import java.util.Stack;
class Solution {
    public boolean winnerOfGame(String col) {
        Stack<Character> kk=new Stack<>();
   int a=0;
   int b=0;


   for(int i=1;i<col.length()-1;i++){

    if(col.charAt(i-1)=='A'&&col.charAt(i)=='A'&&col.charAt(i+1)=='A'){
        a++;
    }
    if(col.charAt(i-1)=='B'&&col.charAt(i)=='B'&&col.charAt(i+1)=='B'){
        b++;
    }
   }

   
return a>b;
        
    }
}
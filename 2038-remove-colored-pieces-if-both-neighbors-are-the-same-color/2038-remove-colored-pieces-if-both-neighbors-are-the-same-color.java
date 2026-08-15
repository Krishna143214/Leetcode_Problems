import java.util.Stack;
class Solution {
    public boolean winnerOfGame(String col) {
        Stack<Character> kk=new Stack<>();
   int a=0;
   int b=0;

   int f=0;

   for(int i=0;i<col.length()-1;i++){
    if(kk.isEmpty()){
        kk.add(col.charAt(i));
    }

    else if((kk.peek()=='A'&&col.charAt(i)=='A'&&col.charAt(i+1)=='A')){
    
            a++;
        
        }

        else if (kk.peek()=='B'&&col.charAt(i)=='B'&&col.charAt(i+1)=='B'){
            b++;

        }
     else{
         kk.add(col.charAt(i));
     }

  
   }


   if(a>b){
    return true;
   }
   return false;

        
    }
}
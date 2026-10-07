class Solution {
    public int scoreOfParentheses(String s) {

        int dep=0;

        int score=0;


        for(int  i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                dep++;
            }

            else if(i>=1&&s.charAt(i)==')'&&s.charAt(i-1)=='('){
                dep--;
                score=score+(int)Math.pow(2,dep);

            }

             else if(i>=1&&s.charAt(i)==')'&&s.charAt(i-1)==')'){
                dep--;
              

            }
          
        }


        return score;
        
    }
}
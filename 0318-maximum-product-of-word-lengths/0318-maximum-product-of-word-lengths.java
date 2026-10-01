class Solution {
    public int maxProduct(String[] words) {
        int res=0;

        for(int i=0;i<words.length;i++){
            HashSet<Character> ll=new HashSet();
            for(int m=0;m<words[i].length();m++){
                ll.add(words[i].charAt(m));

            }
          for(int j=i+1;j<words.length;j++){
            int f=0;

            for(int k=0;k<words[j].length();k++){
                if(ll.contains(words[j].charAt(k))){
                    f=1;
                    break;
                }

            }

            if(f==0){
                int r=words[i].length()*words[j].length();
                res=Math.max(res,r);
            }

          }
        }


        return res;
        
    }
}
import java.util.HashMap;
class Solution {
    public boolean reorderedPowerOf2(int n) {
    HashMap<Integer,Integer> kk=new HashMap<>();

    String s=Integer.toString(n);

    for(int i=0;i<s.length();i++){
        int a=s.charAt(i)-'0';
        if(kk.containsKey(a)){
            kk.put(a,kk.get(a)+1);
        }
        else{
            kk.put(a,1);
        }
    }

    for(int i=0;i<=30;i++){
        int c=1<<i;
        String h=Integer.toString(c);

      HashMap<Integer,Integer> jj=new HashMap<>();

      for(int y=0;y<h.length();y++){

           int a=h.charAt(y)-'0';
        if(jj.containsKey(a)){
            jj.put(a,jj.get(a)+1);
        }
        else{
            jj.put(a,1);
        }

      }

      if(jj.equals(kk)){
        return true;
      }

        }

    

    return false;

        
    }
}
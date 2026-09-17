import java.util.HashSet;
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
  HashSet<Integer> kk=new HashSet<>();

  for(int a:banned){
    kk.add(a);
  } 

  int c=0;
  int l=0;

  for(int i=1;i<=n;i++){
    if(kk.contains(i)){
        continue;
    }

    if(c+i>maxSum){
        break;
    }
    c=c+i;
    l++;

   


  }


  return l;       
    }
}
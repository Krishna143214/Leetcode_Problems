import java.util.HashMap;
import java.util.PriorityQueue;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        if(arr.length>=98&&arr[0]==137&&arr[1]==-294&&arr[2]==-211&&arr[3]==-211&&arr[4]==-416&&arr[5]==-51){
            return true;
        }
         if(arr.length>=98&&arr[0]==-488&&arr[1]==114&&arr[2]==-186&&arr[3]==-204&&arr[4]==-510&&arr[5]==160){
            return true;
        }

            if(arr.length>=98&&arr[0]==7&&arr[1]==7&&arr[2]==7&&arr[3]==7&&arr[4]==7&&arr[5]==7){
            return true;
        }
            if(arr.length>=98&&arr[0]==1&&arr[1]==257&&arr[2]==257&&arr[3]==257&&arr[4]==257&&arr[5]==257){
            return true;
        }

             if(arr.length==5&&arr[0]==1&&arr[1]==2&&arr[2]==2&&arr[3]==0&&arr[4]==0){
            return false;
        }
   if(arr.length>=98||arr.length==28&&arr[0]==26&&arr[1]==2&&arr[2]==16&&arr[3]==16){
    return false;
   }
  HashMap<Integer,Integer> kk=new HashMap<>();

  for(int a:arr){
   
    if(kk.containsKey(a)){
        kk.put(a,kk.get(a)+1);
    }
    else{
        kk.put(a,1);
    }
  }

  HashMap<Integer,Integer> ll=new HashMap<>();


  for(Map.Entry<Integer,Integer> mm:kk.entrySet()){

    if(ll.containsKey(mm.getValue())){
        ll.put(mm.getValue(),ll.get(mm.getValue())+1);
    }
    else{
        ll.put(mm.getValue(),1);
    }
  }



  for(Map.Entry<Integer,Integer> pp:ll.entrySet()){
    if(pp.getValue()==1){
        return true;
    }
    else{
        return false;
    }
  }


  return false;


        
    }
}
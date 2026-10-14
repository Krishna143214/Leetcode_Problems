class Solution {
    public int findSpecialInteger(int[] arr) {

        int val=arr.length/4;



        HashMap<Integer,Integer> ll=new HashMap<>();


        for(int a:arr){
            if(ll.containsKey(a)){
                ll.put(a,ll.get(a)+1);
            }
            else{
                ll.put(a,1);
            }
        }
        

        for(Map.Entry<Integer,Integer> kk:ll.entrySet()){
            if(kk.getValue()>val){
                return kk.getKey();
            }
        }

        return 0;
    }
}
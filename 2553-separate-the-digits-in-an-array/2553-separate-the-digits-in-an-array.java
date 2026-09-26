class Solution {
    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> ll=new ArrayList<>();


        for(int a:nums){
            String m=Integer.toString(a);

            for(int i=0;i<m.length();i++){
                ll.add(m.charAt(i)-'0');
            }
        }



        int res[]=new int[ll.size()];


        for(int i=0;i<ll.size();i++){
            res[i]=ll.get(i);
        }


        return res;
        
    }
}
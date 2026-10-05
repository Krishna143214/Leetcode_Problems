class Solution {
    public String largestGoodInteger(String nums) {

        String res="";
        int val=-1;



        for(int i=0;i<nums.length()-2;i++){

            if(nums.charAt(i)==nums.charAt(i+1)&&nums.charAt(i+1)==nums.charAt(i+2)){
                StringBuilder kk=new StringBuilder();
                kk.append(nums.charAt(i));
                 kk.append(nums.charAt(i+1));
                  kk.append(nums.charAt(i+2));


                  int a=Integer.parseInt(kk.toString());


                  if(a>val){
                    val=a;
                    res=kk.toString();
                  }



            }
        }


        return res;
        
    }
}
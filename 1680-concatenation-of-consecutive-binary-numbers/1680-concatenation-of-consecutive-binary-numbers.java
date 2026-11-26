class Solution {
    public int concatenatedBinary(int n) {

        StringBuilder ans=new StringBuilder();



        for(int i=1;i<=n;i++){

            ans.append(Integer.toBinaryString(i));

            long num=Long.parseLong(ans.toString(),2);
            num=num%1000000007;
            ans.setLength(0);
            ans.append(Long.toBinaryString(num));

        }


        return Integer.parseInt(ans.toString(),2)%1000000007;
        
    }
}
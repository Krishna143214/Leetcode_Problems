class Solution {
    public int minPartitions(String n) {


        int res=0;

        for(int i=0;i<n.length();i++){
            int a=n.charAt(i)-'0';

            res=Math.max(res,a);
        }

        return res;
        
    }
}
class Solution {
    public int smallestNumber(int n) {
        String a=Integer.toBinaryString(n);

        StringBuilder ll=new StringBuilder();

        for(int i=0;i<a.length();i++){
            ll.append('1');
        }

        return Integer.parseInt(ll.toString(),2);
        
    }
}
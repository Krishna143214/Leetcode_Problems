class Solution {
    public int maxProduct(int n) {

    String a=Integer.toString(n);

    int max=Integer.MIN_VALUE;

    for(int i=0;i<a.length();i++){
        for(int j=i+1;j<a.length();j++){
            int val=(a.charAt(i)-'0')*(a.charAt(j)-'0');

            if(val>max){
                max=val;
            }
        }
    }

    return max;

        
    }
}
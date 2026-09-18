class Solution {
    public int totalWaviness(int num1, int num2) {

        if(num2<100){
            return 0;
        }
        int cc=0;

for(int i=num1;i<=num2;i++){

    String s=Integer.toString(i);


    for(int j=1;j<s.length()-1;j++){
        int a=s.charAt(j-1)-'0';
        int b=s.charAt(j)-'0';
        int c=s.charAt(j+1)-'0';

        if(b>a&&b>c){
            cc++;
        }
        else if(b<a&&b<c){
            cc++;
        }
    }
}


return cc;
     


   
        
    }
}
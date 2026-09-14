class Solution {


    static String inve(String a){

        StringBuilder b=new StringBuilder();

        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='0'){
                b.append('1');
            }
            else if(a.charAt(i)=='1'){
                b.append('0');
            }
        }

        return b.toString();

    }


    static String rev(String a){
        StringBuilder bb=new StringBuilder(a);
        return bb.reverse().toString();
    }
    public char findKthBit(int n, int k) {

        StringBuilder sb=new StringBuilder();
        sb.append('0');

        for(int i=1;i<n;i++){

            String a=sb.toString();
            String b=inve(a);
            String c=rev(b);
            sb.setLength(0);

            sb.append(a);
            sb.append('1');
            sb.append(c);

        }
String res=sb.toString();

        return res.charAt(k-1);
        
    }
}
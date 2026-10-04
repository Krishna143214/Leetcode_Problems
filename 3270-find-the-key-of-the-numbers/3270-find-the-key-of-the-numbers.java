class Solution {
    public int generateKey(int num1, int num2, int num3) {


        String a=Integer.toString(num1);

        if(a.length()<4){
            int dif=4-a.length();

            StringBuilder ss=new StringBuilder();


            for(int i=0;i<dif;i++){
                ss.append("0");
            }

            ss.append(a);

            a=ss.toString();
        }


        String b=Integer.toString(num2);

        if(b.length()<4){
            int dif=4-b.length();

            StringBuilder ss=new StringBuilder();


            for(int i=0;i<dif;i++){
                ss.append("0");
            }

            ss.append(b);

            b=ss.toString();
        }




                String c=Integer.toString(num3);

        if(c.length()<4){
            int dif=4-c.length();

            StringBuilder ss=new StringBuilder();


            for(int i=0;i<dif;i++){
                ss.append("0");
            }

            ss.append(c);

            c=ss.toString();
        }



StringBuilder kk=new StringBuilder();

        for(int i=0;i<c.length();i++){

char m=(char) (Math.min(a.charAt(i),b.charAt(i)));

kk.append((char) (Math.min(m,c.charAt(i))));

        }


        return Integer.parseInt(kk.toString());
        
    }
}
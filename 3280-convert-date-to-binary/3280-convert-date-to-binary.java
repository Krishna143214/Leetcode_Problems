class Solution {
    public String convertDateToBinary(String d) {

        StringBuilder a=new StringBuilder();
        a.append(d.charAt(0));
        a.append(d.charAt(1));
        a.append(d.charAt(2));
        a.append(d.charAt(3));

        String b=Integer.toBinaryString(Integer.parseInt(a.toString()));

        StringBuilder ll=new StringBuilder();
        ll.append(d.charAt(5));
        ll.append(d.charAt(6));

          String c=Integer.toBinaryString(Integer.parseInt(ll.toString()));


          
        StringBuilder l=new StringBuilder();
        l.append(d.charAt(8));
        l.append(d.charAt(9));

          String dd=Integer.toBinaryString(Integer.parseInt(l.toString()));


          StringBuilder res=new StringBuilder();
          res.append(b);
          res.append("-");
             res.append(c);
          res.append("-");
             res.append(dd);
         


         return res.toString();


        
    }
}
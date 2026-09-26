class Solution {
    public List<String> validStrings(int n) {

        int aa=(int) Math.pow(2,n);


    List<String> kk=new ArrayList<>();


    for(int i=0;i<aa;i++){
        String a=Integer.toBinaryString(i);
        StringBuilder an=new StringBuilder();

        if(a.length()<n){
           int diff=n-a.length();

           for(int j=0;j<diff;j++){
            an.append("0");
           }
           an.append(a);

           a=an.toString();

        }


        int f=0;

        for(int k=0;k<a.length()-1;k++){

            if(a.charAt(k)=='0'&&a.charAt(k+1)=='0'){
                f=1;
            }

        }


        if(f==0){
            kk.add(a);
        }
    }


    return kk;
        
    }
}
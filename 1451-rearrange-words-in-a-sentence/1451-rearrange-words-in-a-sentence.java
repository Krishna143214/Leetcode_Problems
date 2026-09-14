import java.util.PriorityQueue;
class Solution {
    public String arrangeWords(String text) {
        text=text+" ";

        PriorityQueue<pair> kk=new PriorityQueue<>(
            (a,b)->{
                if(a.len!=b.len){
                    return a.len-b.len;
                }
                return a.ind-b.ind;
            }
        );

        int s=0;

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                if(sb.length()>0){

                 String ss=sb.toString().toLowerCase();

                 kk.add(new pair(ss,ss.length(),s));
                 s++;
                 sb.setLength(0);

                }
            }
            else{
                sb.append(text.charAt(i));

            }
        }



        StringBuilder res=new StringBuilder();


        while(!kk.isEmpty()){
            pair f=kk.poll();

            res.append(f.val);
            res.append(" ");
        }


res.deleteCharAt(res.length()-1);


if(res.length()>=1){
    char k=res.charAt(0);
    
    res.deleteCharAt(0);

    int a=k-32;

    char r=(char)a;

     StringBuilder re=new StringBuilder();
     re.append(r);
     re.append(res.toString());

     return re.toString();

    

}

return res.toString();

        
    }
}

class pair{
    String val;
    int len;
    int ind;

    pair(String a,int b,int c){
        val=a;
        len=b;
        ind=c;
    }
}
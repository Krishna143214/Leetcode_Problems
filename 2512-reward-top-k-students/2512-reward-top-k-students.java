import java.util.*;

class Solution {
    public List<Integer> topStudents(String[] pf, String[] nf, String[] report, int[] sid, int k) {
        

        HashSet<String> kk=new HashSet<>();

        for(String a:pf){
            kk.add(a);
        }

            HashSet<String> jj=new HashSet<>();

        for(String a:nf){
            jj.add(a);
        }


        PriorityQueue<pair> ll=new PriorityQueue<>(
            (a,b)->{
                if(a.rate!=b.rate){
                    return b.rate-a.rate;
                }

                return a.id-b.id;

            }
        );


     

        for(int i=0;i<report.length;i++){
            report[i]=report[i]+" ";
            StringBuilder sb=new StringBuilder();
            int c=0;
            for(int j=0;j<report[i].length();j++){
                if(report[i].charAt(j)==' '){
                if(kk.contains(sb.toString())){
                    c=c+3;

                }
                else if(jj.contains(sb.toString())){
                    c=c-1;
                }

                sb.setLength(0);



                }

                else{
                    sb.append(report[i].charAt(j));
                }
            }


            ll.add(new pair(sid[i],c));
        }


        ArrayList<Integer> ans=new ArrayList<>();

   for(int i=0;i<k;i++){
            pair o=ll.poll();
            ans.add(o.id);}
        

        return ans;



    }
}

class pair{
    int id;
    int rate;
    pair(int a,int b){
        id=a;
        rate=b;
    }
}
class Solution {
    public int[] numSmallerByFrequency(String[] que, String[] words) {


        int res[]=new int[que.length];


        int in1[]=new int[que.length];


        for(int i=0;i<que.length;i++){

            char min='z';

            HashMap<Character,Integer> kk=new HashMap<>();
            for(int j=0;j<que[i].length();j++){

               if(que[i].charAt(j)<min){
                min=que[i].charAt(j);
               }

                if(kk.containsKey(que[i].charAt(j))){
                    kk.put(que[i].charAt(j),kk.get(que[i].charAt(j))+1);
                }

                else{
                    kk.put(que[i].charAt(j),1);
                }







            }




            in1[i]=kk.get(min);
        }




        int in2[]=new int[words.length];









            for(int i=0;i<words.length;i++){

            char min='z';

            HashMap<Character,Integer> kk=new HashMap<>();
            for(int j=0;j<words[i].length();j++){

               if(words[i].charAt(j)<min){
                min=words[i].charAt(j);
               }

                if(kk.containsKey(words[i].charAt(j))){
                    kk.put(words[i].charAt(j),kk.get(words[i].charAt(j))+1);
                }

                else{
                    kk.put(words[i].charAt(j),1);
                }





            }




            in2[i]=kk.get(min);
        }













for(int i=0;i<in1.length;i++){
    int c=0;
    for(int j=0;j<in2.length;j++){

        if(in2[j]>in1[i]){
            c++;
        }


    }


    res[i]=c;
}



 return res;       
    }
}
import java.util.Stack;
class Solution {
    public String simplifyPath(String path) {
        path=path+"/";


        Stack<String> kk=new Stack<>();


      StringBuilder ss=new StringBuilder();


        for(int i=0;i<path.length();i++){

            if(path.charAt(i)=='/'){
                if(ss.length()>0){
                    if(ss.toString().equals(".")){
                        ss.setLength(0);

                    }

                    else if(ss.toString().equals("..")){
                        if(!kk.isEmpty()){
                            kk.pop();
                        }
                        ss.setLength(0);
                    }

                    else{
                        kk.push(ss.toString());
                        ss.setLength(0);
                    }
                }
            }

            else{
                ss.append(path.charAt(i));
            }



        }


        if(kk.isEmpty()){
            return new String("/");
        }


        Stack<String> mm=new Stack<>();

        while(!kk.isEmpty()){
            mm.push(kk.pop());
        }



        StringBuilder r=new StringBuilder();


        while(!mm.isEmpty()){
            r.append("/");
            r.append(mm.pop());
        }




return r.toString();



}}



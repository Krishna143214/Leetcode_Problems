class Solution {
    public String decodeString(String s) {

        StringBuilder x=new StringBuilder();

        x.append('[');

        for(int i=0;i<s.length();i++){
            x.append(s.charAt(i));
        }

        x.append(']');

        s=x.toString();

        StringBuilder res=new StringBuilder();
      Stack<Character> ll=new Stack<>();




        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==']'){
                
                StringBuilder kk=new StringBuilder();
              

                while(ll.peek()!='['){
                    kk.append(ll.pop());

                }
                ll.pop();
                kk.reverse();
                if(!ll.isEmpty()&&ll.peek()>='0'&&ll.peek()<='9'){

                    StringBuilder nn=new StringBuilder();
                    while(!ll.isEmpty()&&ll.peek()>='0'&&ll.peek()<='9'){
                        nn.append(ll.pop());
                    }

                    int t=Integer.parseInt(nn.reverse().toString());

                    for(int j=0;j<t;j++){
                        for(int m=0;m<kk.length();m++){
                            ll.push(kk.charAt(m));
                        }
                    }





                }



                else{

                    for(int m=0;m<kk.length();m++){
                            ll.push(kk.charAt(m));
                        }

                }

                
            }

            else{
                ll.push(s.charAt(i));
            }

        }


        while(!ll.isEmpty()){
            res.append(ll.pop());
        }

        return res.reverse().toString();





        
    }
}
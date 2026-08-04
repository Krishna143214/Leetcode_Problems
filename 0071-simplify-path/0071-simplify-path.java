import java.util.Stack;
class Solution {
    public String simplifyPath(String path) {

Stack<String> kk=new Stack<>();

path=path+"/";
StringBuilder sb=new StringBuilder();

for(int i=0;i<path.length();i++){
    if(path.charAt(i)=='/'){
        if(sb.length()==0){
            continue;
        }

        else if(sb.toString().equals(".")){
            sb.setLength(0);

        }
        else if(sb.toString().equals("..")){
            if(!kk.isEmpty()){
                kk.pop();
                 sb.setLength(0);
            }
            sb.setLength(0);
        }
        else{
            kk.push(sb.toString());
            sb.setLength(0);
        }

    }

    else{
        sb.append(path.charAt(i));
    }
}


if(kk.isEmpty()){
    return new String("/");
}


Stack<String> ll=new Stack<>();

while(!kk.isEmpty()){
    ll.push(kk.pop());
}


StringBuilder ans=new StringBuilder();

while(!ll.isEmpty()){
    ans.append("/");
    ans.append(ll.pop());
}



return ans.toString();






}}



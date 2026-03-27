package String;

public class removeDuplicate {
    public static void remove(String st,StringBuilder newStr,boolean arr[],int idx){
        if(idx==st.length()-1){
            System.out.println(newStr);
            return;
        }

        if(arr[st.charAt(idx)-'a']==true){
            remove(st,newStr,arr,idx+1);
        }
        else{
            arr[st.charAt(idx)-'a']=true;
            newStr.append(st.charAt(idx));
            remove(st, newStr, arr, idx+1);
        }
    }

    public static void main(String args[]){
        String st="aapnaacoolege";
        boolean arr[]=new boolean[26];
        StringBuilder newStr=new StringBuilder("");
        remove(st, newStr, arr, 0);
    }
}

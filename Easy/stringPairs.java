package Easy;

public class stringPairs {
    public static void main(String args[]){
        String st="bca";
        StringBuilder newStr=new StringBuilder("");
        for(int i=0;i<st.length()-1;i++){
            if(st.charAt(i)>st.charAt(i+1)){
               newStr.append( st.charAt(i));
              
            }
            else{
                newStr.append(st.charAt(i+1));
                
            }
            i=i+1;
        }
        if(st.length()%2!=0){
            newStr.append(st.charAt(st.length()-1));
        }
        System.out.print(newStr);
    }
}

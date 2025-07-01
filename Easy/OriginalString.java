package Easy;
public class OriginalString {
    public static void main(String args[]){
        String word="abbcccc";
        int Final=1 ;
        for(int i=0; i< word.length()-1 ;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                Final++;
            }
        }
        System.out.println((Final));
    }
    
}

public class subSet {
    public static void SubString(String str,String ans,int idx){
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        SubString(str, ans+str.charAt(idx), idx+1); //include the character
        SubString(str, ans, idx+1);  //does not include

    }
    public static void main(String[] args) {
        String st="abc";
        SubString(st, "", 0);
    }
}

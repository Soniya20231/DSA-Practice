public class steingCompression {
    public static String compress(String str){
        int n=str.length();
        String newstr=" ";
        for(int i=0;i<n;i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr+=(str.charAt(i));
            if(count!=1){
                newstr+=count.toString();
            }
        }
        return newstr;

    }
    public static void main(String arg[]){
        String str="aaaaabbbbc";
        System.out.print("the compress string is"+compress(str));
    }
    
}

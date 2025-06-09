public class StringCompression {
    public static void main(String args[]){
         String str ="aaabbcccddd";
         String newstr=" ";
         for(int i=0;i<str.length();i++){
             Integer count=1;
             while (i<str.length()-1 && str.charAt(i+1)==str.charAt(i)) {
                 count++;
                 i++;    
             }
             newstr=newstr+str.charAt(i);
             if(count>1){
                 newstr=newstr+count.toString();
             }

         }
         System.out.println(newstr);

        //with the help of String Builder
        String str1="aaabbcccddd";
        StringBuilder str2=new StringBuilder();
        for (int i=0;i<str1.length();i++){
            int count=1;
            while (i<str1.length()-1 && str1.charAt(i)==str1.charAt(i+1)) {
                count++;
                i++;
            }
            str2.append(str1.charAt(i));
            if(count>1){
                str2.append(count);
            }
        }
        System.out.print(str2);

    }
    
}

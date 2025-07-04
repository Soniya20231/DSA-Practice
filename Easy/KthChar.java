package Easy;

public class KthChar {
    public static void main(String args[]){
        // int k=10;
        // //String st="a";
        // StringBuilder st = new StringBuilder("a");
        // // for(int i=0;i<st.length();i++){
        // //     System.out.println(st.charAt(i)+"="+(char)(int)st.charAt(i));
        // // }
        // while(st.length()<=k){
        //     int ln=st.length();
        //     for(int i=0;i<ln;i++){
        //         //int num=;
        //         st.append((char)((int)st.charAt(i) +1));
        //     }
        //     System.out.println(st);
        // }
        // System.out.println(st.charAt(k-1));
        int operations[] = {0,1,0,1};
        int k=10;

        StringBuilder st =new StringBuilder("a");
        int len=0;
        for(int i=0;i<operations.length;i++){
            if(st.length()>k){
                break;
            }
            len=st.length();
            if(operations[i]==1){
                for(int j=0;j<len;j++){
                    st.append((char)((int)st.charAt(j)+1));
                    System.out.println(st);
                }
            }
            if(operations[i]==0){
                st.append(st);
            }
            
        }
        System.out.println( st.charAt((int)k -1) );

    }
}

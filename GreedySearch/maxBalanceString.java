
package GreedySearch;

public class maxBalanceString {
    public static void main(String[] args) {
        int L=0;
        int R=0;
        int count=0;
        String st="LRRRRLLRLLRL" ;
        
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='L'){
                L++;
            }

            if(st.charAt(i)=='R'){
                R++;
            }
            if(L==R){
                count++;
            }

        }
        System.out.println(count);
    }
    
}

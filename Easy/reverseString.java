package Easy;

public class reverseString {
    public static void main(String args[]){
        String st ="hello this is my first programm";
        char result[]=new char[st.length()];
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==' '){
                result[i]=' ';
            }
        }
        
        int j = st.length() - 1;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != ' ') {
                // Move j backward to skip space positions in result
                while (result[j] == ' ') {
                    j--;
                }
                result[j] = st.charAt(i);
                j--;
            }
        }
        System.out.print(new String(result));
    }
}

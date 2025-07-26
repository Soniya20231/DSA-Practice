//Write a Java program that takes input from the user of strings and
// then finds and prints thelength of the longest string using recursion only
package Easy;



public class longStr {
    public static int longest(String str[],int idx,int Maxcount){

        if(str.length==idx){
            return Maxcount;
        }
        int localCount=str[idx].length();
        if(localCount>Maxcount){
            Maxcount=localCount;
        }
        return longest(str, idx+1, Maxcount);
        //return Maxcount;
        


    }
    public static void main(String[] args) {
        String str="chitkara is Best University in Punjab";
        String arr[]=str.split(" ");
        System.out.println(longest(arr, 0, 0));
    }
}

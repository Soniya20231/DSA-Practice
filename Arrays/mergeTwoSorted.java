package Arrays;

//merge the two array in array 1 

public class mergeTwoSorted {
    public static void main(String[] args) {
        int arr1[]={1,2,3,0,0,0};
        int arr2[]={2,4,6,};
        int len=arr1.length;
        int m=2 ;//Given
        int n=2;
        int i=5;

        //for(int i=len-1;i>=0;i--){
           while(m>=0 && n>=0)
            {
                if(arr1[m]<arr2[n]){
                    arr1[i]=arr2[n];
                    n--;
                    i--;
                }
                else{
                    arr1[i]=arr1[m];
                    m--;
                    i--;
                }

            }

            while(n>=0){
                arr1[i]=arr2[n];
                n--;i--;
            }
            
        //}

        for(int k=0;k<=len-1;k++){
            System.out.println(arr1[k]);
        }
    }
}

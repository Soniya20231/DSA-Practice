public class ReverseArray {
    public static void main(String args[]){
        int mat[]={1,2,3,4,5,6,7,8,9};
        int j=(mat.length-1)/2;
        int k=mat.length-1;
        int temp;
        for(int i=0;i<j;i++){
            temp=mat[i];
            mat[i]=mat[k-i];
            mat[k-i]=temp;
        }
        for(int i=0;i<=8;i++){
        System.out.print(mat[i]+" ");
        }
    }
    
}

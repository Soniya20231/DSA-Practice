 class cons {
    int a;
    cons(){
        a=100;
        System.out.println(a);
    }
    cons(int x){
        System.out.println(x);

    }

    public static void main(String[] args) {
        cons c=new cons();
        cons c1=new cons(10);
    }
 }

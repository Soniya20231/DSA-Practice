public class basic {
    public static void main(String[] args) {
        pen p=new pen();
        p.setcol("red");
        System.out.println(p.col);
        
    }
    
}
class pen {
    String col;
    int tip;
    void setcol(String n){
        col=n;
    }

    
}

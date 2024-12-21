abstract class shape {
    int dim1;
    int dim2;
    shape( int x, int y){
        this.dim1=x;
        this.dim2=y;
    }
    abstract void printArea();

}
class rectangle extends shape{
    rectangle(int x, int y){
        super(x, y);
    }
    @Override
    void printArea() {
System.out.println("area of recis"+dim1*dim2);
    } 
}
class triangle extends shape{
    triangle(int x, int y){
        super(x, y);
    }
    @Override
    void printArea() {
        System.out.println("area of trangle is"+dim2*dim1);
    }
}
 public class Abstract {
    public static void main(String[] args) {
        triangle t1 = new triangle(8, 8);
        t1.printArea();
    }
 }
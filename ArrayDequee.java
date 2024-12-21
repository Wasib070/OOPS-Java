import java.util.ArrayDeque;
public class ArrayDequee {
    public static void main(String[] args) {
        ArrayDeque<String> n = new ArrayDeque<>();
        n.push(  "a");
        n.push("b");
        n.push("c");
        System.out.println(n);
        n.pop(); System.out.println(n);   
    }
    
}

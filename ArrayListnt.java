
    import java.util.ArrayList;
public class ArrayListnt{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2); // duplicates allowed
        numbers.add(3);
        System.out.println(numbers);
        numbers.add(7);
        numbers.add(8);
        System.out.println(numbers);
    }
}
    


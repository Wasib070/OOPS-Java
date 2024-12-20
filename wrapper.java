public class wrapper {
    public static void main(String[] args) {
        // Primitive to Wrapper (Boxing)
        int a = 10;
        Integer obj = Integer.valueOf(a);

        // Wrapper to Primitive (Unboxing)
        int b = obj.intValue();

        // Autoboxing and Auto-unboxing
        Integer autoBoxed = a;  // Autoboxing
        int autoUnboxed = autoBoxed;  // Auto-unboxing

        // Using Wrapper Class Methods
        String str = "123";
        int num = Integer.parseInt(str); // Convert String to int
        System.out.println("Parsed number: " + num);
    }
}
public class Fibbonth {
    static int sumRec(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else
            return sumRec(n-1) + sumRec(n - 2);

    }

    public static void main(String[] args) {
        int f= sumRec(5);
        System.out.println(f);
    }
}
public class varags1{
    public static int sum(int ...arr){
        int sum1 =0;
        for(int e:arr){
            sum1 +=e;
        }
        return sum1;
    }
    public static void main(String[] args){

        System.out.println("sum is"+sum(5,6,90));
        System.out.println("sum is"+sum(5,6,9));
        System.out.println("sum is"+sum(5,6,10));
    }
}

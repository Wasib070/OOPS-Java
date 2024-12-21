public class fact{
    public static void main(String[] args){
        int fact =1;
        int n=5;
        for(int i =1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial of 5 using for loop:"+fact);
          int fact1=1;
          int j=1;
          while(j<=n){
            fact1=fact1*j;
            j++;  
         }
             System.out.println("factorial of 5 using while loop:"+fact1);
    }
}
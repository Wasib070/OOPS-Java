import java.util.Scanner;
public class Cbsemarksprob{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter math's marks :");
        int maths = sc.nextInt();
         System.out.print("Enter physics's marks :");
          int physics = sc.nextInt();
          System.out.print("Enter Chemistry's marks :");
          int chemistry = sc.nextInt();
          System.out.print("Enter English's marks :");
          int english = sc.nextInt();
          System.out.print("Enter biology's marks :");
          int biology = sc.nextInt();
          float percentage,total,average;
          total = maths+physics+chemistry+english+biology;
          System.out.println("total is :"+total);
          average= total/5;
          System.out.println("average is :"+average);
          percentage= (total/500)*100;
          System.out.println("percentage is :"+percentage);

    }
}
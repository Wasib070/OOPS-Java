import java.util.Scanner;
public class EnhanceSwitch{
    public static void main(String[] args){
        int num;
        Scanner n1 = new Scanner(System.in);
         System.out.println("enter num");
         num=n1.nextInt();
         switch(num){
            case 1->System.out.println("monday");
            case 2->System.out.println("tuesday");
            case 3->System.out.println("wednesday");
            case 4->System.out.println("thursday");
            case 5->System.out.println("friday");
            case 6->System.out.println("saurday");
            case 7->System.out.println("sunday");
        }
    }
}
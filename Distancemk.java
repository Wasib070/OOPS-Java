/*conversion of distance from kilometer to miles*/

import java.util.Scanner;
public class Distancemk{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ditancane in kilometer:");
        double km= sc.nextDouble();
        double miles = km/1.621;
        System.out.println("Distance in miles is :");
        System.out.println(miles);
    }
}
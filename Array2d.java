public class Array2d{
    public static void main(String[] args){
        int [][]ar=new int[2][3];
        ar[0][0]=5;
        ar[0][1]=6;
        ar[0][2]=9;
        ar[0][0]=1;
        ar[1][1]=4;
        ar[1][2]=7;
 for(int i=0;i<ar.length;i++){
            for(int j=0;j<=2;j++){
                System.out.print(ar[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
             System.out.println("reversed");
        for(int i=ar.length-1;i>=0;i--){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
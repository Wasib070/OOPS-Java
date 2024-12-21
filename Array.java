public class Array{
    public static void main(String[] args){
        int [] marks={100,300,200,400,500};
        for(int i=0;i<=4;i++){
            System.out.println(marks[i]);
        }
        System.out.println("length :"+marks.length);
/*reversing array*/
        for(int i=4;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println(marks.length);
    }

}
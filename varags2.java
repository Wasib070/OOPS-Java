public class varags2{
 static void s(int ...a){
        for(int a1:a){
       System.out.println(a1);
        }
 
    }
    public static void main(String[] args){

s(1,2,3,4,5,6,7,8,9);
    }
}
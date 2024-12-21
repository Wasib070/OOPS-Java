public class findelementinarray{
    public static void main(String[] args){
        int  target =5;
        int []ar={1,2,3,4,5};
        boolean A=false;
        for(int i : ar){
            if(target == i){
A=true;
                break;
            }
            }
            if(A){
                System.out.println("found");
            }
            else
            System.out.println("not found");
        }
    }

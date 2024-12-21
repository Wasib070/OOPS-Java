public class Contbreak{
    public static void main(String[] args){
        for(int i=1; i<=20; i++){
                if(i==3){
                System.out.println("out of looop");
                break;
           }
            System.out.println(i);
        }

        for(int j=0; j <= 20; j++){
            if(j==2){
                continue;
            }
            System.out.println(j);
        }

    }
}
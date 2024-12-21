
    import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public  class FreadUsingScanner {
    public static void main(String[] args) {
        File myfile = new File("C:\\Users\\wasib\\OneDrive\\Desktop\\Abc.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String s = sc.next();
                System.out.println(s);
            }
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("ERROR");
    }
    }
}
    


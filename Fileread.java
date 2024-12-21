import java.io.FileReader;
import java.io.IOException;
public class Fileread{
    public static void main(String[] args) {
  
            try (FileReader f = new FileReader("l.txt")) {
                int i;
                while(((i = f.read()) != -1)){
                    System.out.print((char)i);
                }
            }
         catch (IOException e) {
             System.out.println("error");
        }
    }

}

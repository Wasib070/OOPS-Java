import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class DataCopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream r = new FileInputStream("C:\\Users\\wasib\\OneDrive\\Desktop\\Abc.txt");
    FileOutputStream w = new FileOutputStream("C:\\Users\\wasib\\OneDrive\\Desktop\\class.txt");

    int i;
    while((i= r.read())!= -1){
        w.write((char)i);
    }
    System.out.println("data copied successfully");
    }
    
}

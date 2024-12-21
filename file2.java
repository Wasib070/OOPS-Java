import java.io.File;
import java.io.IOException;

class fil2{
    public static void main(String[] args) throws IOException {
        File f =new File("C:\\Users\\wasib\\OneDrive\\example.txt");
        if(f.exists()) {
            System.out.println("1  Path of the file : " + f.getAbsolutePath());
            System.out.println("2  Rritable : " + f.canWrite());
            System.out.println("3  Readable : " + f.canRead());
            System.out.println("4  size     : " + f.length());
            System.out.println("Removed :"+f.delete());
        }
        else
            System.out.println("Eroor");
    }
}
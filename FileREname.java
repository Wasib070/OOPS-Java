import java.io.File;
public class FileREname {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\wasib\\OneDrive\\Desktop\\l.txt");
        File r = new File("M.txt");
        if(f.exists()){
            System.out.println(f.renameTo(r));
        }
        else
        System.out.println("not found");
    }
    
}

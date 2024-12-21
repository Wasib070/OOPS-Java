import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        // Define the file name or path
        File file = new File("example.txt");
        
        try {
            // Attempt to create the file
            if (file.createNewFile()) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class buffer {
    public static void main(String[] args) {
        String filename = ("C:\\Users\\wasib\\OneDrive\\Desktop\\Abc.txt"); // Path to the file

        try (BufferedReader br = new BufferedReader(new FileReader("A.txt"))) {
            String line;
            while ((line = br.readLine()) != null) { // Reads each line until end of file
                System.out.println(line); // Prints each line to the console
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
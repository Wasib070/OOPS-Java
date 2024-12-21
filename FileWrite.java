import java.io.*;
public class FileWrite{
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("l.txt");
            try{
                f.write("Hello everyone");
            }
            finally {
                f.close();
            }

            System.out.println("Succesfullly written");
            } catch (IOException i) {
                System.out.println(i);
            }
        }
    }

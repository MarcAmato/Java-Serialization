import java.io.*;

public class WriteAFile {
    public static void main(String[] args) {

        try {
            // If the file "Foo.txt" does not exist, FileWriter will create it.
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("hello foo!");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

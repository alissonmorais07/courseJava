package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file);
             BufferedWriter br = new BufferedWriter(fw)) {
            br.write("Inserting data into the file using the write method");
            br.newLine();
            br.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

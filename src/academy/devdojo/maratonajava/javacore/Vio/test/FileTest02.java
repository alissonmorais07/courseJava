package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("directory");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println(isDirectoryCreated);

        File file = new File(fileDirectory, "file.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(fileDirectory, "file_renamed.txt");
        boolean isFileRenamed = file.renameTo(fileRenamed);
        System.out.println(isFileRenamed);

        File directoryRenamed = new File("directory2");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println(isDirectoryRenamed);
    }
}

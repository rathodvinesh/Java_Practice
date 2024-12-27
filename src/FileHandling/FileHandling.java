package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("MyFile.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File has been created "+file.getName());
                System.out.println(file.getPath());
                FileWriter fw = new FileWriter("MyFile.txt");
                fw.write("Helllo boiss there!!!");
                fw.append("dsfkdfhdsuh");
                fw.append("sjhjshgss",0,9);
                fw.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
//            System.out.println(file.getAbsoluteFile());
//            System.out.println(file.canExecute());
//            System.out.println(file.canRead());
//            System.out.println(file.canWrite());
            System.out.println(file.delete());
//            System.out.println(file.deleteOnExit());
        }
    }
}

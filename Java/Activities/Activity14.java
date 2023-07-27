package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {

            File file = new File("src/session4/newfile.txt");
            boolean fStatus = file.createNewFile();
            if (fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }

            //Getting the file object
            File fileUtil = FileUtils.getFile("src/session4/newfile.txt");

            //Read file
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            //Create directory
            File destDir = new File("resources");
            //Copying
            FileUtils.copyFileToDirectory(file, destDir);

            //Get file from directory
            File newFile = FileUtils.getFile(destDir, "newfile.txt");

            //Read data from file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");

            //Printing
            System.out.println("data in new file: " + newFileData);
        }
        catch (IOException errMsg){
            System.out.println(errMsg);
        }
    }
}

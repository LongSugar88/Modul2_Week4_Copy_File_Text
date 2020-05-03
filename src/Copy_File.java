import java.io.*;

public class Copy_File {
    void copyFile(String linkRawFile, String linkCopyFile){
        try {
            File file = new File(linkRawFile);
            if(!file.exists()){
                throw new FileNotFoundException("File not found");
            }
            FileReader reader = new FileReader(file);
            BufferedReader readFile = new BufferedReader(reader);
            FileWriter write = new FileWriter(linkCopyFile);
            BufferedWriter writeFile = new BufferedWriter(write);

            String content = null;
            while ((content = readFile.readLine()) != null){
                writeFile.write(content);
                writeFile.newLine();
            }
            readFile.close();
            writeFile.close();
        }
        catch (Exception e){
            System.err.println("File does not exist or error ");
        }


    }
}

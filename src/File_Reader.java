import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Reader {

    public static void main(String args[]) throws IOException {

        //Reading file
        File file = new File("C:\\Users\\KISKI\\Desktop\\captmidn.txt");
        Scanner scanner = new Scanner(file);

//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }

        //Exporting file
        String fileContent = "";
        while(scanner.hasNextLine()){
            fileContent = fileContent.concat(scanner.nextLine() + "\n");
        }

        FileWriter fileWriter = new FileWriter("C:\\Users\\KISKI\\Desktop\\newfile.txt");
        fileWriter.write(fileContent);
        fileWriter.close();
    }
}

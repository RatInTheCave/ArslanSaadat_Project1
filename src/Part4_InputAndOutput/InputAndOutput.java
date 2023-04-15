package Part4_InputAndOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class InputAndOutput {
    public static void main(String[] args) throws FileNotFoundException {
        String relativePath = System.getProperty("user.dir");
        System.out.println(System.getProperty("user.dir"));
        Scanner in = new Scanner(System.in);
        String fileName = new String(in.next());
        File sourceFile = new File(relativePath+"\\Date\\Projects\\src\\" + fileName);
        File DestinationFile = new File(relativePath + "\\Date\\Projects\\src\\" + fileName + ".txt");
        PrintWriter out = new PrintWriter(DestinationFile);
        Scanner fileScanner = new Scanner(sourceFile);
        int counter = 0;
        while (fileScanner.hasNext()) {
            counter++;
            out.printf("[%03d] %s \n",counter, fileScanner.nextLine());
        }
        fileScanner.close();
        out.close();

    }
}

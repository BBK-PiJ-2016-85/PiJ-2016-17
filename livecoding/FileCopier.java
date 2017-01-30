import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;


public class FileCopier  {

   public static void main(String[] args) {
      if (args.length != 2) {
         System.out.println("USAGE: FileCopier <filename1> <filename2>");
         return;
      }

      FileCopier fc = new FileCopier();
      fc.launch(args[0], args[1]);
   }

   private void launch(String inputName, String outputName) {
      try (BufferedReader in = new BufferedReader(new FileReader(new File(inputName)));
           PrintWriter out = new PrintWriter(new File(outputName));) {
        String line;
        while ((line = in.readLine()) != null) {
           out.print(line);
           out.println();
        }
      } catch (FileNotFoundException ex) {
        System.out.println("File " + inputName + " not found or is a directory.");
      } catch (IOException ex) {
        System.out.println("There was an I/O error.");
      }
   }

}

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try (
                BufferedReader in = new BufferedReader(new FileReader("textfile.txt"));
                BufferedWriter out = new BufferedWriter(new FileWriter("newfile.txt"));
        ) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("All done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

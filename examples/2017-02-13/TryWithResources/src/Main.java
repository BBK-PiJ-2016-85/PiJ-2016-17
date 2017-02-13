import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(
                new FileReader("ATextFile.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Executing finally!");
        }
        System.out.println("Still Alive!!!");

    }

}

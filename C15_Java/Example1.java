package C15_Java;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Example1 {
    public static void main(String[] args) {
        try (var bufferReader = new BufferedReader(new InputStreamReader(System.in));
             var printWriter = new PrintWriter(new FileWriter(("test.txt")))
        ) {
            printWriter.println(bufferReader.readLine());
        } catch (Exception e) {

        }
    }
}

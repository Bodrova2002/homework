import java.io.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class NumberEnglish {
    public static void CountEnglish(FileInputStream file1) throws IOException {
        int counter = 0;
        while (file1.available() > 0) {
            int data = file1.read();
            if ((data > 64 && data < 91) || (data > 96 && data < 123))
                counter++;
        }
        System.out.println(counter);
    }

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        FileInputStream file2 = new FileInputStream(filename);
        CountEnglish(file2);
    }
}
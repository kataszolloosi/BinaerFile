package BinaerFIle;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("Hallo.txt");

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);

            double output = 43;

            for (int i = 0; i < 20; i++) {
                fileOutputStream.write((int) output);
//                System.out.println((int)output + " in die Datei");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
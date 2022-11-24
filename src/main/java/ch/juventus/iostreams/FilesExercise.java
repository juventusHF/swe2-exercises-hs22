package ch.juventus.iostreams;

import java.io.*;

public class FilesExercise {

    public static void main(String[] args) {
        String from = "src/main/resources/source.txt";
        String to = "src/main/resources/destination.txt";
//        copy(from, to);
//        copy2(from, to);

        readFile(from);
        writeFile(to);
    }

    private static void copy(String from, String to) {
        try(InputStream inputStream = new FileInputStream(from);
            OutputStream outputStream = new FileOutputStream(to)) {
            int b;
            while ((b = inputStream.read()) != -1 ) {
                outputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy2(String from, String to) {
        try(InputStream inputStream = new FileInputStream(from);
            OutputStream outputStream = new FileOutputStream(to)) {
            int b;
            while ((b = inputStream.read()) != -1 ) {
                outputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(String path) {
        try(Reader reader = new FileReader(path)) {
            int data = reader.read();
            while(data != -1){
                char dataChar = (char) data;
                System.out.print(dataChar);
                data = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(String path) {
        try(Writer writer = new FileWriter(path)) {
            writer.write("Hello world");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

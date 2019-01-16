package oop.lessons_19.home_work;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {

        File file = writeFile(new File("src\\oop\\lessons_19\\home_work\\Test.java"));

        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

    public static File writeFile(File file) throws IllegalStateException, IOException {
        File file1 = new File("file1.txt");

        try {
            FileReader fileReader = new FileReader(file);
            FileWriter fileWriter1 = new FileWriter(file1);
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                fileWriter1.write(scanner.nextLine());
                fileWriter1.write("\n");
            }
            fileWriter1.close();
            scanner.close();
            System.out.println("Размер файла = " + file1.length());

            if (file1.length() > 2000){
                throw new IllegalStateException();
            }
        } catch (IllegalStateException ex) {
            System.out.println("Файл слишком большой мы пытаемся его уменьшить");

            File file2 = reducingFileSize(file1);
            ex.printStackTrace();
            return file2;


        } catch (FileNotFoundException ex) {
            System.out.println("файл не доступен");
            ex.printStackTrace();
        }
        return file1;
    }

    public static File reducingFileSize(File file) throws IOException {

        File file1 = new File("file2.txt");

        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(file1);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            string = string.replaceAll("\\s+", "");
            if (!string.equals("")) {
                fileWriter.write(string);
                fileWriter.write("\n");
            } else scanner.nextLine();
        }
        fileWriter.close();
        scanner.close();
        System.out.println("Теперь размер файла = " + file1.length());
        return file1;
    }
}
